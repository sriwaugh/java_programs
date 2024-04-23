package java_program;
import java.util.ArrayList;
import java.util.Stack;
public class Push_the_element_from_the_bottom_of_the_stack {
    public static void main(String[] args) {
            Stack<Integer> a=new Stack<>();
            ArrayList<Integer> c=new ArrayList<>();
            a.push(3);
            a.push(4);
            a.push(5);
            Stack<Integer> b=new Stack<>();
            b.push(10);
            System.out.println(a);
            while(!a.isEmpty())
            {
                int z= b.push(a.pop());
                c.add(z);
            }
            int n=c.size();
            while(!c.isEmpty()&&n>0)
            {
                int y=c.get(n);
                b.push(y);
                n--;
            }
            System.out.println(b);
        }
    }

