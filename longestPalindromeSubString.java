package java_program;

import java.util.Scanner;

public class longestPalindromeSubString {
    public static String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=1,start=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(checkPalindrome(s,i,j) && (j-i+1)> maxlen ){
                    start=i;
                    maxlen=j-i+1;
                }
            }

        }
        return s.substring(start,start+maxlen);
    }
    public static  boolean checkPalindrome(String str,int low,int high){
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        System.out.println(longestPalindrome(st));
    }
}
