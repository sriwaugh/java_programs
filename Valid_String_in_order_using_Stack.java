package java_program;
import java.util.Stack;
public class Valid_String_in_order_using_Stack {
        public static void main(String[] args) {
            Stack<String> st=new Stack<>();
            String S="TOM TOM JERRY JERRY";
            String[] str=S.split(" ");
            st.push(str[0]);
            for (int i = 1; i < str.length;i++) {
                if (!st.isEmpty() && st.peek().equals(str[i]))
                {
                    st.pop();
                }
                else{

                    st.push(str[i]);
                }
            }
            if(st.isEmpty())
            {
                System.out.println("The given String is Valid");
            }
            else{
                System.out.println("The given String is not Valid");
            }
        }
    }

