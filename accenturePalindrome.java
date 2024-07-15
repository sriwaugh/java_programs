package java_program;

public class accenturePalindrome {
        static boolean isPalindrome(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false; // Not a palindrome
                }
            }
            return true; // Palindrome
        }

        public static void main(String[] args) {
            String str = "madam";
            if (isPalindrome(str)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

