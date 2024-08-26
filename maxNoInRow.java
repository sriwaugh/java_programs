package java_program;
import java.util.*;
public class maxNoInRow {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[][] =new int[n][n];
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] =s.nextInt();
                }
            }
            int sum=0;
            int max=Integer.MIN_VALUE;
            for (int i=0;i<n;i++)
            {
                sum=0;
                for(int j=0;j<n;j++)
                {
                    sum+=arr[i][j];
                }
                if(max<sum)
                {
                    max=sum;
                }
            }
            System.out.println("The maximum value of row "+max);
        }
    }

