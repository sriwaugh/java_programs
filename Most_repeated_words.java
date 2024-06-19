package java_program;
import java.util.*;
public class Most_repeated_words {
    public static void main(String[] args) {
        mostRepeatedWords("Sri is a programer and sri is a student");
    }
    public static List<String> mostRepeatedWords(String str) {
        List<String> res = new ArrayList<>();
        String[] arr = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        int maxAppearance = 0;
        for (Map.Entry<String, Integer> mapElement : map.entrySet()) {
            int val = mapElement.getValue();
            String key = mapElement.getKey();
            if (val == maxAppearance) {
                res.add(key);
            } else if (val > maxAppearance) {
                maxAppearance = val;
                res = new ArrayList<>();
                res.add(key);
            }
        }
        return res;
    }
}

