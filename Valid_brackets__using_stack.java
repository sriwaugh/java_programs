package java_program;
import java.util.Scanner;
import java.util.Stack;
public class Valid_brackets__using_stack {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the brackets(Like {}()[])");
            String S=s.next();
            int  n=S.length();
            Stack<Character> a=new Stack<>();
            for (int i = 0; i < n; i++)
            {
                if (S.charAt(i) == '(') {

                    a.push(')');
                } else if (S.charAt(i) == '[') {

                    a.push(']');
                } else if (S.charAt(i) == '{') {
                    a.push('}');
                } else if (a.isEmpty() || a.pop() != S.charAt(i)) {
                    System.out.println("not valid");
                    System.exit(0);
                }
            }
            System.out.println("Valid brackets");
        }
}


