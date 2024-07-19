package java_program;

import java.util.Arrays;
import java.util.Scanner;

public class replacingOccurance {
    public static String replace(String s){
        char[] ch=s.toCharArray();
        String c ="";
        for (int i = 0; i < s.length(); i++) {
              if(ch[i]=='a')
              {
                  c+="b";
              }
              else if(ch[i]=='b'){
                 c+="a";
              }
              else{
                  c+=ch[i];
              }
        }
        return c;
    }
    public static void main(String[] args) {
        String  s= "aabbababa";
        String c=replace(s);
        System.out.println(c);
    }
}
