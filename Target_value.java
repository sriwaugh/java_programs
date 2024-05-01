package java_program;

import java.util.Scanner;

public class Target_value {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 90, 6};
        int n = arr.length;
        int j = 0;
        int t = 99;
        for (int i = 0; i < n; i++)
        {
            loop:
            if (j == n - 1)
            {
                j = 0;
                continue;
            }
            else
            {
                j++;
                if (arr[i] + arr[j]==t)
                {
                    System.out.println(i + " " + j);
                }
                break loop;
            }
        }
    }

    public static class Palindrome_array {


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

    }
}


