package java_program;
    class Stack {
        int len;
        int stack[];
        int top;

        Stack(int len) {
            this.len = len;
            stack = new int[len];
            top = -1;
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (len - 1 == top);
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack is Full");
            } else {
                stack[++top] = data;
            }
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
            } else {
                top--;
            }
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return stack[top];
        }
    }

    public class Day2program1 {
        public static void main(String[] args) {
            Stack st = new Stack(1);
            st.push(0);
            st.push(10);
            System.out.println(st.peek());
        }
    }



