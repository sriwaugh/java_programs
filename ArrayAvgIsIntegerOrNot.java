package java_program;

import java.util.Scanner;

public class ArrayAvgIsIntegerOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =s.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int a=0;
        int avg = sum;
        if (avg % n==0) {
            System.out.println("Integer");
        } else {
            int rem = avg %  n;
            System.out.println("If you add this number it can be a Whole Integer "+ (n-rem));

        }
    }
}
