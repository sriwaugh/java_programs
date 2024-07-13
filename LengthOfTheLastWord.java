package java_program;

public class LengthOfTheLastWord {
    public static int lengthOfLastWord(String s) {
        String[] x=s.split(" ");
        int n=x.length;
        String y=x[n-1];
        return y.length();

    }

    public static void main(String[] args) {
        String s="hi i am Sriwaugh";
        System.out.println(lengthOfLastWord(s));
    }
}
