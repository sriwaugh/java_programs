package java_program;
import java.util.*;


    class StackArrayList {
        ArrayList<Integer> n = new ArrayList<>();

        public void push(int data) {
            n.add(data);
        }

        public int pop() {
            int top = n.remove(0);
            return top;
        }

        public int peek() {
            if (n.isEmpty()) {
                return -1;
            }
            return n.get(0);
        }
    }

      public class Day2program2 {
        public static void main(String[] args) {
            StackArrayList st = new StackArrayList();
            st.push(10);
            st.pop();
            System.out.println(st.peek());
        }
    }

