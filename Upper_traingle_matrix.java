package java_program;
import java.util.Scanner;
public class Upper_traingle_matrix {
        public static void main(String[] args) {
            int n,m;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the row of the matrix");
            n=s.nextInt();
            System.out.println("enter the column of the matrix");
            m=s.nextInt();
            int arr[][]=new int[n][m];
            System.out.println("Enter the matrix element");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j]=s.nextInt();
                }
            }
            System.out.println("The matrix element are");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("The  daigonal value in matrix");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(j<=i-1)
                    {
                        int y=arr[i][j]=0;
                        System.out.print(y+" ");
                    }
                    else{

                        System.out.print(arr[i][j]+" ");
                    }

                }
                System.out.println();
            }
        }
    }

