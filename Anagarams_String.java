package java_program;

public class Anagarams_String {
        public static void main(String[] args) {
            String a = "Silent";
            String b = "listen";
            int count = 0;
            char str[] = a.toCharArray();
            char str1[] = b.toCharArray();

            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str1.length; j++) {
                    if (str[i] == str1[j]) {
                        count++;
                    }
                }
            }
            if (count == str.length) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }

