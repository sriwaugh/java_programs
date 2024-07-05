package java_program.Patterns;

import jdk.jshell.StatementSnippet;

import java.util.Scanner;

public class kPattern {
    public static void kpattern(int n)
    {
        for (int i = 0; i < 2 * n; i++) {
            int col = i < n ? n-i : i - n + 1;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        kpattern(n);
    }
}
