package java_program;
import java.util.Scanner;
public class print_10_to_1_using_recursion {
        public static  int pri(int n,int num) {

            if (n==num)
            {
                System.out.println(n);
                return n;
            }
            else{
                System.out.println(num);
                return pri(n,num+1);
            }
        }

        public static void main(String[] args) {
            int n,num=1;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            pri(n,num);

        }
    }

