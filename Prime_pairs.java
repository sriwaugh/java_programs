package java_program;

import java.util.Scanner;

public class Prime_pairs {
        public static int prime(int num) {
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
            int a, b,count=0;
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            for (int i = a; i <b; i++) {
                int var1=prime(i);
                int j=i+6;
                int var2=prime(j);
                if(var1!=0 && var2!=0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

