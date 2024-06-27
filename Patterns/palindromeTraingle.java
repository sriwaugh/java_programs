package java_program.Patterns;

import java.util.Scanner;

public class palindromeTraingle {
    public static void palindormetraingle(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = i; j< n ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        palindormetraingle(n);
    }
}
