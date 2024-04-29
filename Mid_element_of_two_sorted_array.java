package java_program;

import java.util.Arrays;
import java.util.Scanner;

public class Mid_element_of_two_sorted_array {
        public static void main(String[] args) {
            int n, m,j=0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of the first array");
            n=s.nextInt();
            System.out.println("Enter the first array elements");
            int arr1[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i]=s.nextInt();
            }
            System.out.println("Enter the size of the second array");
            m=s.nextInt();
            int arr2[]=new int[m];
            System.out.println("Enter the second array elements");
            for (int i = 0; i < m; i++) {
                arr2[i]=s.nextInt();
            }
            int k=arr1.length+arr2.length;
            int[] arr3=new int[k];
            for (int i = 0; i <k ; i++) {
                if(i<arr1.length)
                {
                    arr3[i]=arr1[i];
                }
                else{
                    arr3[i]=arr2[j];
                    j++;
                }
            }
            Arrays.sort(arr3);
            int x=arr3[k/2];
            if(arr3.length%2!=0)
            {
                System.out.println(x);
            }
            else{
                int y=arr3[k/2]+arr3[(k/2)-1];
                double z=(double)y/2;
                System.out.println(z);
            }
        }

    }

