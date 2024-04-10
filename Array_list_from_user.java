package java_program;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_list_from_user {
        public static void main(String[] args) {
            int n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the arraylist size");
            n=s.nextInt();
            System.out.println("Enter the element of the array List");
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int z=s.nextInt();
                a.add(z);
            }

            System.out.println("The array List element is");
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print(+a.get(i)+",");
            }
            System.out.println("]");
        }
    }

