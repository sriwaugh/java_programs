package java_program;
import java.util.Scanner;
public class Hack_the_money {
    public static void main(String[] args) {
            int n,count=0;
            Scanner s = new Scanner(System.in);
            n= s.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i <n; i++) {
                arr[i]=s.nextInt();
            }
            for (int i = 0; i <n; i++) {
                count=0;
                if (arr[i]==1) {
                    System.out.println("yes");
                }
                if(arr[i]%10==0){
                    count++;
                }
                if (arr[i]%20==0)
                {
                    count++;
                }
                if(count==2)
                {
                    System.out.println("yes");

                }
                else{
                    System.out.println("no");

                }
            }
        }
    }


