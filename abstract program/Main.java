package abstract_program;

import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {

        char ch;
        Shape shape;
        double i,i1,i2;
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        switch(ch)
        {
            case 'S':
                i=s.nextDouble();
                shape=new sqr(i);
                break;

            case 'R':
                i=s.nextDouble();
                i2=s.nextDouble();
                shape =new rect(i,i2);
                break;
            case 'C':
                i=s.nextDouble();
                shape =new cir(i);
                break;
            case 'T':
                i=s.nextDouble();
                i1=s.nextDouble();
                i2=s.nextDouble();
                shape =new tri(i,i1,i2);
                break;
            default :
                System.out.println("Invalid choice ");
                return ;

        }
        System.out.printf("Perimeter : %.2f",shape.perimeter());
        System.out.println();
        System.out.printf("Area : %.2f",shape.area());
    }}

