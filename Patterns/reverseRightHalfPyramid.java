package java_program.Patterns;

import java.util.Scanner;

public class reverseRightHalfPyramid {
    public static void reverserighthalf(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        reverserighthalf(n);
    }
}
