package java_program.Patterns;

import java.util.Scanner;

public class hallowTraingle {
    public static  void hallowtraingle(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                  if(i == 0 || i == n-1 || j == 0 || j == i)
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
        hallowtraingle(n);
    }
}
