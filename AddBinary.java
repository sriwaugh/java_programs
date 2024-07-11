package java_program;

import java.util.Scanner;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int i=0,carry=0;
        String res="";
        while(i<a.length()||i<b.length()||carry!=0)
        {
            int x=0;
            if(i<a.length() && a.charAt(a.length()-1-i)=='1')
            {
                x=1;
            }
            int y=0;
            if(i<b.length() && b.charAt(b.length()-1-i)=='1'){
                y=1;
            }
            res=String.valueOf((x+y+carry)%2) + res;
            carry=(x+y+carry)/2;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        System.out.println(addBinary(a,b));
    }
}
