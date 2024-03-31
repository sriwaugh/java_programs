package java_program;
import java.util.Arrays;
import java.util.Scanner;
public class binary_search {
        public static  void binary(int[] a,int x,int h,int l)
        {
            int mid=(h+l)/2;
            if(h>l) {
                if (x == a[mid]) {
                    System.out.println("The position of search element "+mid);
                    System.exit(0);
                } else if (x < a[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
                binary(a, x, h, l);
            }
            else{
                System.out.println("Element not found");

            }
        }

        public static void main(String[] args) {
            int h,l=0,x;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the size of the array ");
            h=s.nextInt();
            System.out.println("The array element is");
            int a[]=new int[h];
            for(int i=0;i<h;i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            System.out.println("Enter the search element");
            x=s.nextInt();
            binary(a,x,h,l);
        }
    }

