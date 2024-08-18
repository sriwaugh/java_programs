package java_program;

import java.util.Scanner;

public class leftRotateOfArray {
    public static void leftrotate(int arr[],int x)
    {
       int n= arr.length;
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
        int[] arr = new int[n];
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("How may time do u want to rotate the array in left");
        int x=s.nextInt();
        leftrotate(arr,x);
    }
}
