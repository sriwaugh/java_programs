package java_program;

import java.util.Scanner;

public class findTheSecondLargestElement {
    public static int largeElement(int arr[])
    {
        int first =Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
             first = Math.max(first,arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=first)
            {
                second = Math.max(arr[i],second);
            }
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.print("The second largest element is ");
        System.out.println(largeElement(arr));
    }
}
