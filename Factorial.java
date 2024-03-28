package java_program;
import java.util.Scanner;
public class Factorial {
        public static void main(String[] args) {
            int fact=1;
            int n,i;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number");
            n=s.nextInt();
            if(n==0)
            {
                System.out.println("0");
                System.exit(0);
            }else{
                for( i=1;i<=n;i++)
                {
                    fact=fact*i;
                }}
            System.out.println(fact);
        }
    }

