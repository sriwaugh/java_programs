package java_program;
import java.util.Arrays;
import java.util.Scanner;
public class FindOneDuplicateInArray {
    public static void findduplicate(int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]==arr[i-1])
            {
             arr[count]=arr[i];
             count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
       findduplicate(arr);
    }
}
