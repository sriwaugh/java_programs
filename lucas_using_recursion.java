package java_program;
import java.util.Scanner;
public class lucas_using_recursion {
        public static  void lucas(int n,int a,int b,int c,int sum)
        {
            int i=3;
            if(n>i)
            {
                sum=a+b+c;
                a=b;
                b=c;
                c=sum;

                System.out.println(sum);
                i++;
                lucas(n-1,a,b,c,sum);

            }

        }

        public static void main(String[] args) {
            int n,a=0,b=1,c=1,sum=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            lucas(n,a,b,c,sum);

        }
    }

