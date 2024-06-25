package java_program.Patterns;

import java.util.Scanner;

public class noIncreasingTraingularReverse {
    public static void reversePyramid(int n)
    {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        reversePyramid(n);
    }
}
