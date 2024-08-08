package java_program;

import java.util.Scanner;

public class peakElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=0;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i>=1||i<n-1)
            {
                if(arr[i-1]<arr[i]&&arr[i+1]<arr[i])
                {
                    System.out.println("The peak element is "+arr[i]);
                    x++;
                }
            }
            else{
                if(arr[0]>arr[1])
                {
                    System.out.println("The peak element is "+arr[i]);
                    x++;
                }
                if(arr[n-1]>arr[n-2])
                {
                    System.out.println("The peak elemnet is "+arr[i]);
                    x++;
                }
            }
        }
        if(x==0)
        {
            System.out.println("There is no peak element");
        }

    }
}
