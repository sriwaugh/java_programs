package java_program;

import java.util.Arrays;
import java.util.Scanner;

public class kthLargestAndKthesmallest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("The array element is");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("The Kth element is");
        int k=s.nextInt();
        Arrays.sort(arr);
        System.out.println("The largest "+k+" element is "+arr[k-1]);
        System.out.println("The smallest "+k+" element is "+arr[n-k]);
    }
}
