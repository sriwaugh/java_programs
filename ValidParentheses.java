package java_program;
import java.util.Stack;
import java.util.Scanner;
public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] st=s.toCharArray();
        Stack<Character> a=new Stack();
        int n=st.length;
        for (int i = 0; i < n; i++)
        {
            if (st[i] == '(') {

                a.push(')');
            } else if (st[i] == '[') {

                a.push(']');
            } else if (st[i] == '{') {
                a.push('}');
            } else if (a.isEmpty()) {
                return false;
            }
            else{
                if(!a.isEmpty()&&a.peek().equals(st[i])){
                    a.pop();
                }
                else{
                    return false;
                }
            }
        }
        return a.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a= s.next();
        int b=0;
        boolean x=isValid(a);
        System.out.println(x);
    }
}
