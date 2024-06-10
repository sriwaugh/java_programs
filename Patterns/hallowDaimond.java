package java_program.Patterns;

import java.util.Scanner;

public class hallowDaimond {
    public static void hallowdaimond(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int col = i < n ? i : 2*n -i;
            int spaces =  n-col;
            for (int j = 0; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                if( j==0 || j == col-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        hallowdaimond(n);
    }
}
