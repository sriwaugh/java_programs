package java_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequentNoInArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[] =new int[n];
        for (int i = 0; i < n; i++) {
         arr[i]=s.nextInt();
        }
        Map<Integer,Integer> freq =new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
         int maxValue=0;
         for (Map.Entry<Integer,Integer> entry :freq.entrySet())
         {
             if (entry.getValue() > maxValue) {
                 maxValue = entry.getKey();
             }
         }
        System.out.println("The most frequent number is "+maxValue);
    }
}
