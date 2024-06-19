package java_program;
import java.util.*;

public class Remove_repeated_words_from_String {
    public static String removeRepeatedWords(String str) {
        StringBuilder res = new StringBuilder();
        Set<Character> s = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!s.contains(letter)) {
                s.add(letter);
            } else {
                s.remove(letter);
            }
        }
        // s.forEach((i) -> {
        // res.append(i);
        // });
        for (char i : s) {
            res.append(i);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        removeRepeatedWords("Apple");
    }
}
