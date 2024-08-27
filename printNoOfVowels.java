package java_program;
import java.util.*;
public class printNoOfVowels {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String st=s.nextLine();
            int n=s.nextInt();
            int a=0;
            for(int i=0;i<st.length();i++)
            {
                if(st.charAt(i)=='a' ||st.charAt(i)=='e'|| st.charAt(i)=='i'|| st.charAt(i)=='o'|| st.charAt(i)=='u'){
                    System.out.println(st.charAt(i));
                    a++;
                }
                if(a==n)
                {
                    System.exit(0);
                }
            }
        }
    }
