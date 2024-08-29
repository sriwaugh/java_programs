package java_program;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSubArraySum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=s.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target sum value");
        int a=s.nextInt();
        ArrayList<Integer> val=new ArrayList<>();
        int sum=0,first=0,last=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n; j++) {
                val.add(0);
                sum += arr[j];
                if (sum == a) {
                    val.add(1, j);
                    System.out.println("The sum of elements from " + first + "to" + last);
                    System.exit(0);
                }
                if (sum > a) {
                    sum = 0;
                    val.add(0, j);
                }
            }
        }
    }
}
