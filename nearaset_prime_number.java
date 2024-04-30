package java_program;

import java.util.Scanner;

public class nearaset_prime_number {
        public static int frprime(int num)
        {
            int c = 2, count = 0;
            while (c * c<=num) {
                if (num % c == 0) {
                    count++;
                    break;
                }
                c++;
            }
            if (count == 0)
                return num;
            else
                return 0;
        }
        public static void main(String[] args) {
            int n,pr,nt=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i <n; i++) {
                int prev=arr[i]--;
                int nxt=arr[i]++;
                while(prev!=0){
                    pr=frprime(prev);
                    prev--;
                    if(pr!=0)
                    {
                        break;
                    }
                }
                while(prev!=0){
                    nt=frprime(nxt);
                    nxt++;
                    if(nt!=0)
                    {
                        break;
                    }
                }
                int p=arr[i]-prev;
                int q=nt-arr[i];
                if(p<=q)
                {
                    System.out.println(prev);
                }
                else {
                    System.out.println(nt);
                }
            }
        }
    }


