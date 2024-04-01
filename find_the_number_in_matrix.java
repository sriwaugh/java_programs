package java_program;
import java.util.Scanner;
public class find_the_number_in_matrix {
        public static void main(String[] args) {
            int n,m,i,j;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the row of the matrix");
            n=s.nextInt();
            System.out.println("Enter the coloumn of the matrix");
            m=s.nextInt();
            int arr[][]=new int[n][m];
            System.out.println("Enter the matrix element");
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }
            System.out.println("Enter the element you want to search");
            int x=s.nextInt();
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    if(arr[i][j]==x)
                    {
                        System.out.println("The Index of the search element is "+i+" "+j);
                        System.exit(0);
                    }
                }
            }
        }
    }

