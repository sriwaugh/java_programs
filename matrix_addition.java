package java_program;
import java.util.Scanner;
public class matrix_addition {
        public static void main(String[] args) {
            int n,m,i,j,q,p;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the row of the  matrix");
            n=s.nextInt();
            System.out.println("Enter the coloumn of the  matrix");
            m=s.nextInt();

            int arr[][]=new int[n][m];
            int arr1[][]=new int[n][m];
            int arr2[][]=new int[n][m];
            if(n!=m)
            {
                System.out.println("the matrix is not acceptable");
            }
            else {
                System.out.println("Enter the 1st matrix element");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        arr[i][j] = s.nextInt();
                    }
                }
                System.out.println("Enter the 2nd matrix element");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        arr1[i][j] = s.nextInt();
                    }
                }
                System.out.println();
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");

                    }
                    System.out.println();
                }
                System.out.println();
                for (i = 0; i < n; i++) {
                    for (j = 0; j < m; j++) {
                        System.out.print(arr1[i][j] + " ");

                    }
                    System.out.println();
                }
                System.out.println();
                for (i = 0; i < n; i++) {

                    for (j = 0; j < m; j++) {
                        arr2[i][j]=arr[i][j]+arr1[i][j];

                    }

                }
                System.out.println("The addition of the two matrix");
                for (i = 0; i < n; i++) {

                    for (j = 0; j < m; j++) {
                        System.out.print(arr2[i][j]+" ");

                    }
                    System.out.println();

                }
            }
        }
    }


