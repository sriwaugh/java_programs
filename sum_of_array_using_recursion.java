package java_program;
import java.util.Scanner;
public class sum_of_array_using_recursion {
        public static  void sum(int[] a,int n,int i,int s)
        {

            if(i<n){
                s+=a[i];
                sum(a,n,i+1,s);
            }
            else {
                System.out.println("The sum of the array is " + s);
            }
        }
        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            n=s.nextInt();
            int a[]=new int[n];
            System.out.println("The element of the array is");
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            sum( a,n,0,0);
        }
    }

