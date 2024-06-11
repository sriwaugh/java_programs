package java_program.Patterns;

import java.util.Scanner;

public class reverseHallowtraingle {
    public static  void reversehallowtraingle(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                if(i == 0 || i == n-1 || j == i || j == n-1)
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
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        reversehallowtraingle(n);
    }
}
