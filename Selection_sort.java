package java_program;
import java.util.Scanner;
public class Selection_sort {
    public static void main(String[] args) {
            {
                int n;
                Scanner s= new Scanner(System.in);
                System.out.println("Enter the size of the array");
                n=s.nextInt();
                int a[]=new int[n];
                System.out.println("Enter the array elements");
                for (int i = 0; i < n; i++) {
                    a[i]=s.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    int small =i;

                    for (int j = i+1; j <n ; j++) {
                        if(a[small]>=a[j])
                        {
                            small=j;
                        }
                        int swap=a[small];
                        a[small]=a[i];
                        a[i]=swap;
                    }
                }
                System.out.println("The sorted array is");
                for (int i = 0; i <n ; i++) {
                    System.out.println(a[i]);

                }
            }
        }
    }

