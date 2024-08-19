package java_program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class rightRotateOfArray {
    public static void rightrotate(int arr[],int x)
    {
        int n= arr.length;
        int t[] =new int[n];
        for (int i = 0; i < n; i++) {
            t[i]=arr[i];
        }
        for (int i = 0; i < x; i++) {
            int temp = arr[n-1];
            for (int j = 0; j < n; j++) {
                arr[j + 1] = t[j];
            }
            arr[0] = temp;
        }
        System.out.println("The "+x+"  right rotated array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("How may time do u want to rotate the array in right");
        int x=s.nextInt();
        rightrotate(arr,x);
    }
}
