package java_program;
import java.util.Stack;public class Length_of_the_word {
        public static void main(String[] args) {
            Stack<String> a=new Stack<>();
            a.push("hello");
            a.push("world");
            String z=a.peek();
            int b=0;
            System.out.println(z.length());
        }
    }

