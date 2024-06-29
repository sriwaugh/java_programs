package java_program.Patterns;

import java.util.Scanner;

public class daimondPattern {
    public static void daimondpattern(int n)
    {
        for (int i = 0; i < 2 * n; i++)
           {
               int totalcoloumnsinrow = i > n ? 2 * n - i : i;
               int spaces = n - totalcoloumnsinrow;
               for (int j = 0; j < spaces; j++) {
                   System.out.print(" ");
               }
               for (int j = 0; j < totalcoloumnsinrow; j++) {
                   System.out.print("* ");
               }
               System.out.println();
           }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        daimondpattern(n);
    }
}
