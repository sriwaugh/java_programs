package java_program;
import java.util.Arrays;
import java.util.Scanner;
public class Anagarms_using_sorting {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the first String");
            String a=s.next();
            System.out.println("Enter the second string");
            String b=s.next();
            String c=a.toLowerCase();
            String d=b.toLowerCase();
            char[] s1=c.toCharArray();
            char[] s2=d.toCharArray();
            System.out.println(s1);
            Arrays.sort(s1);
            Arrays.sort(s2);
            String z= String.valueOf(s1);
            String y=String.valueOf(s2);
            if(z.equals(y))
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }

        }
    }

