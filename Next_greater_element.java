package java_program;
import java.util.Scanner;
public class Next_greater_element {
        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.println("Engter the size of the array");
            n=s.nextInt();
            System.out.println("Enter the array elements");
            int a[] =new int[n];
            int ans[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            for (int i = 0; i <n ; i++) {
                for (int j = i+1; j < n; j++) {

                    if(a[i]<a[j])
                    {
                        ans[i]=a[j];
                        break;
                    } else{
                        ans[i]=-1;
                        break;
                    }
                }}
            ans[n-1]=-1;

            for (int i = 0; i < n; i++) {


                System.out.println(ans[i]);
            }
        }
    }

