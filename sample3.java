package java_program;

import java.util.Scanner;

public class sample3 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n=s.nextInt();
            int j=n-1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n ; i++) {
                if(i<j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}
