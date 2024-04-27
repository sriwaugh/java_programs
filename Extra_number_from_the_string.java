package java_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Extra_number_from_the_string {
        public static void main(String[] args) {
            String str;
            ArrayList<Integer> arr=new ArrayList<>();
            Scanner s = new Scanner(System.in);
            str= s.nextLine();
            String[] st=str.split(" ");
            for (int i = 0; i < st.length; i++) {
                if(Character.isDigit(st[i].charAt(0)))
                {
                    int num=Integer.valueOf(st[i]);
                    arr.add(num);
                }
            }
            Collections.sort(arr);
            System.out.println(arr.getLast());
        }
    }


