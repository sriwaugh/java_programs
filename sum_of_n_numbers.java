package java_program;
import java.util.Scanner;
public class sum_of_n_numbers {
        public static  int  sum(int n)
        {
            if(n==0)
            {
                return 0;
            }
            else if(n==1)
            {
                return 1;
            }
            else{
                int s=n+sum(n-1);
                return s;
            }
        }

        public static void main(String[] args) {
            int n;
            Scanner s =new Scanner(System.in);
            System.out.println("Enter the number ");
            n=s.nextInt();
            int res=sum(n);

            System.out.println(" The sum  of n numbers "+res);
        }
    }

