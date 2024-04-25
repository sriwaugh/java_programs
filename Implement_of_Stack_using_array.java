package java_program;
import java.util.ArrayList;
public class Implement_of_Stack_using_array {
        static class Stack{
            ArrayList<Integer> n=new ArrayList<>();
            public void push(int data)
            {
                n.add(data);
            }
            public boolean isempty()
            {
                boolean ans=n.size()==0;
                return ans;
            }
            public int pop()
            {
                int top=n.remove(n.size()-1);
                return top;
            }
            public int peek(){
                if(isempty())
                {
                    return -1;
                }
                return n.get(n.size()-1);
            }
        }
        public static void main(String[] args) {

            Stack stk=new Stack();
            stk.push(1);
            stk.push(2);
            stk.push(3);
            stk.push(4);
            while(!stk.isempty())
            {
                System.out.println(stk.peek());
                stk.pop();
            }
        }
    }


