package java_program;
import java.util.Scanner;
public class House_robber {
        public static void main(String[] args) {
            int n,sum=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                sum+=a[i];
                i++;
            }
            System.out.println(sum);
        }
    }

