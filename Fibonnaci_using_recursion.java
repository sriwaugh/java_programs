package java_program;
import java.util.Scanner;
public class Fibonnaci_using_recursion {
    public static  int fib(int a)
        {

            if(a==0||a==1)
            {
                return a;
            }

            else {

                a=fib(a-1)+fib(a-2);
                return a;
            }
        }

        public static void main(String[] args) {
            int a;
            Scanner s=new Scanner(System.in);
            a=s.nextInt();
            int res=fib(a);
            int b=0;
            System.out.println(res);
        }

    }

