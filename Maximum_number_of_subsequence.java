package java_program;

import java.util.Scanner;

public class Maximum_number_of_subsequence {
    public static void main(String[] args) {
            int n,max=0,sum=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]=s.nextInt();
            }
            for (int i = 0; i <n; i++) {
                for (int j = i+2; j <n; j=j+2) {
                    sum=arr[i]+arr[j];
                    if(max<sum){
                        max=sum;
                    }
                }
            }
            System.out.println(max);
        }
    }


