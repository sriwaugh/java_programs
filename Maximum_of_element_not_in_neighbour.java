package java_program;
import java.util.Scanner;
public class Maximum_of_element_not_in_neighbour {
        public static void main(String[] args) {
            int n;
            int max=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            for (int i = 0; i <n ; i++) {


                if(i>0&&i<n-1)
                {
                    if(a[i]>a[i+1]&&a[i]>a[i-1])
                    {
                        System.out.println(a[i]);

                    }
                }

            }

        }
    }

