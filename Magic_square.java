package java_program;
import java.util.*;
public class Magic_square {
        public static void main(String[] args) {
            int n,z=0,b=0,c=0,d=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[][]=new int[n][n];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=s.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    if(i==j)
                    {
                        z+=a[i][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    if(i+j==n-1)
                    {
                        b+=a[i][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                c=0;
                for (int j = 0; j <n ; j++) {


                    c+=a[j][i];

                }
                if(z!=c&&b!=c)
                {
                    System.out.println("Not a magic square");
                    System.exit(0);
                }
            }
            for (int i = 0; i < n; i++) {
                d=0;
                for (int j = 0; j <n ; j++) {


                    d+=a[i][j];

                }
                if(z!=d&&b!=d)
                {
                    System.out.println("Not magic square");
                    System.exit(0);
                }
            }
            System.out.println("The given matrix is a magic square");
        }
    }


