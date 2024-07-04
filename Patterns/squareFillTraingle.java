package java_program.Patterns;

import java.util.Scanner;

public class squareFillTraingle {
    public static void squarefilltraingle(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        squarefilltraingle(n);
    }
}
