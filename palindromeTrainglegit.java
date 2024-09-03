package java_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class palindromeTrainglegit {
    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =new ArrayList<>();
        if(numRows==0)
        {
            return result;
        }
        List<Integer> firstrow =new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(numRows==1)
        {
            return result;
        }
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev=result.get(i-1);
            List<Integer> current=new ArrayList<>();
            current.add(1);
            for(int j=1;j<i;j++)
            {
                current.add(prev.get(j) + prev.get(j - 1));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        generate(n);
    }
}
