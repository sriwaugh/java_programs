package java_program;

import java.util.Scanner;

public class Palindrome_array {
        public static void main(String[] args) {
            int n,ans=0;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0, j = arr.length - 1; i<=j; ) {
                if (arr[i] == arr[j]) {
                    i++;
                    j--;
                }
                else if (arr[i] < arr[j]) {
                    i++;
                    arr[i] = arr[i] + arr[i -1];
                    ans++;
                } else {
                    j--;
                    arr[j ] = arr[j] + arr[j + 1];
                    ans++;
                }
            }
            System.out.println("Its take "+ans+" steps");
        }
    }


