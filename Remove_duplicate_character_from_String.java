package java_program;

import java.util.HashMap;
import java.util.Map;

public class Remove_duplicate_character_from_String {
    public static String remove_duplicate(String str)
    {
        Map<Character,Integer> rem=new HashMap<>();
        char ch;
        for (int i = 0; i <str.length() ; i++) {
            ch = str.charAt(i);
            if(!rem.containsKey(ch))
            {
                rem.put(ch,1);
            }
            else {
                rem.put(ch,rem.get(ch)+1);
            }

        }
        StringBuilder res=new StringBuilder();
        for(Map.Entry<Character,Integer> element :rem.entrySet())
        {
            if(element.getValue()==1)
            {
                 res.append(element.getKey());
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println( remove_duplicate("swiss"));
    }
}
