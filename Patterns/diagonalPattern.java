package java_program.Patterns;
import java.util.*;
public class diagonalPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=0,c=0;
        for(int i=1;i<=n;i++)
        {
            a=i;
            b=1;
            for(int j=1;j<=n;j++)
            {
                if(a>n)
                {
                    System.out.print(b+" ");
                    b++;
                }
                else{
                    System.out.print(a+" ");

                }

                a++;
            }
            System.out.println();
        }
    }
}
