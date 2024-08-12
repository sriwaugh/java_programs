package java_program;

import java.util.Scanner;

public class varabilesBasedOnNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder st=new StringBuilder();
        String a=s.nextLine();
        int n = a.length();
        for (int i = 0; i < n; i+=2) {
            char letter =a.charAt(i);
            int x=Character.getNumericValue(a.charAt(i+1));
                for (int j = 0; j < x; j++) {
                    st.append(letter);
                }
            }
        System.out.println(st.toString());
        }
    }
