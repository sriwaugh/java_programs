package java_program.Patterns;

import java.util.Scanner;

public class zeroOneTraingle {
    public static void zeroOne(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
            {
                if(i%2 != 0) {
                      if (j % 2 == 0) {
                         System.out.print("0 ");
                     }
                      else {
                        System.out.print("1 ");
                     }
                }
                else{
                        if(j % 2 != 0)
                        {
                            System.out.print("0 ");
                        }
                        else{
                            System.out.print("1 ");
                        }
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        zeroOne(n);
    }
}
