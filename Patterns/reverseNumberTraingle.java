package java_program.Patterns;

import java.util.Scanner;

public class reverseNumberTraingle {
    public static void reversenumbertraingle(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner  s= new Scanner(System.in);
        int n= s.nextInt();
        reversenumbertraingle(n);
    }
}
