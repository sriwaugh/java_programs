package java_program;
import java.util.Scanner;
public class linear_search_using_recursion {
        public static  void linear(int[] a,int z,int b,int x)
        {

            if(z<b){
                if(a[z]==x)
                {
                    System.out.println("The position of the search element is"+z);
                    System.exit(0);

                }

                linear(a,z+1,b,x);
            }
            else{
                System.out.println("The Search Element is not found");
            }
        }

        public static void main(String[] args) {
            int b,x,z=0,i;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number of elemente in array" );
            b=s.nextInt();
            int a[]=new int[b];
            System.out.println("Enter the array value");
            for( i=0;i<b;i++){
                a[i]=s.nextInt();
            }
            System.out.println("Enter the element you want to search");
            x=s.nextInt();
            linear(a,z,b,x);
        }
    }

