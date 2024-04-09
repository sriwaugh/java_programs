package java_program;
import java.util.ArrayList;
import java.util.Scanner;
public class Array_list_String {
        public static void main(String[] args) {
            int n;
            System.out.println("Enter the size of the Array List");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            ArrayList<String> a=new ArrayList<>();
            System.out.println("Enter the Array List element");
            for(int i=0;i<n;i++)
            {
                String z=s.next();
                a.add(z);

            }
            System.out.println("The Array List elements are");
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print(a.get(i)+",");
            }
            System.out.print("]");
        }
    }

