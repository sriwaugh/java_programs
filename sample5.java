package java_program;

import java.util.Arrays;
import java.util.Scanner;

public class sample5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
