package java_program;
import java.util.Scanner;
public class Print_the_left_diagonal_of_matrix {
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
            System.out.println("The left daigonal value are");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
        }
}

