package java_program;

import java.util.Scanner;

public class Divide_the_apples {
        public static void main(String[] args) {
            int n,sum=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]=s.nextInt();
            }
            for (int i = 0; i <n; i++) {
                sum=+arr[i];
            }
            int avg=sum/4;
            while(arr[0]<=avg && arr[n-1]<=avg){
                if(arr[0]<=avg)
                {

                }
            }
        }
    }


