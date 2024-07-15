package java_program;

public class reverseTheOrderOfString {
    public static void main(String[] args) {
        String s = "Hello";
        String x = " ";
        for (int i = s.length()-1; i >=0 ; i--) {
            x+=s.charAt(i);
        }
        System.out.println(x);
    }
}