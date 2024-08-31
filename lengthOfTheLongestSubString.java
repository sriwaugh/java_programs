package java_program;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lengthOfTheLongestSubString {
    public static void findlen(String st)
    {
        int i=0,j=0,max=0,k=0;
        Set<Character> charset = new HashSet<>();
        while (j<st.length())
        {
            if(!charset.contains(st.charAt(j)))
            {
                charset.add(st.charAt(j));
                j++;
                max=Math.max(max,j-i);
            }
            else{
                charset.remove(st.charAt(i));
                i++;
            }
        }
        System.out.println("The length of the substring is "+max);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String st=s.nextLine();
        findlen(st);
    }
}
