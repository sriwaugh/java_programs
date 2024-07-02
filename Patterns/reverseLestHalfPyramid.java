package java_program.Patterns;

import java.util.Scanner;

public class reverseLestHalfPyramid {
    public static void reverselefthalfpyramid(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverselefthalfpyramid(n);
    }
}
