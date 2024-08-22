package java_program;

public class substringOfOccurance {
        public static int substringSearch(String str1, String str2) {
            int index = str1.indexOf(str2);
            return index != -1 ? index : -1;
        }

        public static void main(String[] args) {
            String str1 = "Hello, World";
            String str2 = "World";
            System.out.println(substringSearch(str1, str2));
        }
    }

