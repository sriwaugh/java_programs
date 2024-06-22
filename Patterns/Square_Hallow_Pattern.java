package java_program.Patterns;

import java.util.Scanner;

public class Square_Hallow_Pattern {
    public static void squareHallow(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  if( i == 0 || j == 0 || i == n-1 || j ==n-1)
                  {
                      System.out.print("* ");
                  }
                  else {
                      System.out.print(" ");
                  }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        squareHallow(n);
    }
}
