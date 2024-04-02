package java_program;
import java.util.Scanner;
public class Find_max_value_in_matrix {
        public static void main(String[] args) {
            int n,m,i,j,z=0;
            Scanner s=new Scanner(System.in);
            System.out.println("ENter the row of the matrix");
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
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    if(arr[i][j]>z)
                    {
                        z=arr[i][j];

                    }
                }
            }
            System.out.println("The maximum of the matrix is "+z);
        }
    }

