package java_program;
import java.util.ArrayList;
import java.util.Scanner;
public class check_palindrome {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the String");
            String z=s.nextLine();
            char[] y=z.toCharArray();
            ArrayList<Character> a=new ArrayList<>();
            for (int i = 0; i <y.length ; i++)
            {
                if(Character.isLetter(y[i]))
                {
                    a.add(y[i]);
                }
            }
            int i=0;
            int j=a.size()-1;
            while (i<j)
            {
                if(a.get(i).equals(a.get(j)))
                {
                    i++;
                    j--;
                }
                else
                {
                    System.out.println(false);
                    System.exit(0);
                }
            }
            System.out.println(true);
        }
    }

