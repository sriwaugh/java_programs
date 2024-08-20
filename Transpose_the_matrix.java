package java_program;
import java.util.Scanner;
public class Transpose_the_matrix {
        public static void main(String[] args) {
            int n,m,i,j;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the row of the matrix");
            n=s.nextInt();
            System.out.println("Enter the coloumn of the matrix");
            m=s.nextInt();
            int a[][]=new int[n][m];
            int arr1[][]=new int[n][m];
            System.out.println("Enter the matrix element");
            for(i=0;i<n;i++){
                for(j=0;j<m;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("The matrix is");
            for ( i = 0; i < n; i++) {
                for (j = 0;j<m; j++) {
                    System.out.print(a[i][j]+" ");

                }
                System.out.println();
            }
            for ( i = 0; i < n; i++) {
                for (j = 0;j<m; j++) {
                    arr1[i][j]=a[j][i];

                }

            }
            System.out.println("The transpose matix is");
            for ( i = 0; i < n; i++) {
                for (j = 0;j<m; j++) {
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

