package java_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rightRotateOfArray {
    public static void rightrotate(int[] a,int x)
    {
        int n= a.length;
        int[] arr =new int[n];
        int b=0;
        for (int i = n-1; i >=0 ; i--) {
            arr[b] = a[i];
            b++;
        }
        for (int i = 0; i < x; i++) {
            int temp = arr[0];
            for (int j = 1; j < n; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = temp;
        }
        System.out.println("The "+x+"  left rotated array is ");
       for (int i = 0; i < n; i++) {
           System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("How may time do u want to rotate the array in left");
        int x=s.nextInt();
        rightrotate(a,x);
    }
}
