package java_program;
import java.util.Scanner;
public class minAndMaxInArray {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int max=0;
        int min=Integer.MAX_VALUE;
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(max<=arr[i])
            {
                max=arr[i];
            }
            if(min>=arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("The max value is "+max);
        System.out.println("The min value is "+min);
    }
}
