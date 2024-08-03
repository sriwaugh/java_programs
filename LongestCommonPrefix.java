package java_program;
import java.util.*;
public class LongestCommonPrefix {
    public  static String commonprefix(String[] strs){
    StringBuilder s = new StringBuilder();
        Arrays.sort(strs);
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
    {
        if(first[i]!=last[i])
            break;
        s.append(first[i]);
    }
        return s.toString();
}

    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        commonprefix(s);
    }
}
