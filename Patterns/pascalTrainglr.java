package java_program.Patterns;

import java.util.Scanner;

public class pascalTrainglr {
    public static void pascaltraingle(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            int x=1;
            for (int j = 1; j <=i; j++) {
                System.out.print(x+ " ");
                x = x * (i - j) / j;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        pascaltraingle(n);
    }
}
