package java_program;
import java.util.Scanner;
public class multiplication_table_using_recursion {
        public static int multi(int n,int k)
        {
            int m=0;
            if(k>10)
            {
                return k;
            }
            else{
                System.out.println(n+"*"+k+"="+k*n);
                return multi(n,k+1);

            }
        }
        public static void main(String[] args) {
            int n,k=1;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            multi(n,k);
        }
    }
