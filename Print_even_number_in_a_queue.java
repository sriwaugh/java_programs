package java_program;

import java.util.PriorityQueue;
import java.util.Queue;

public class Print_even_number_in_a_queue {
        public static void main(String[] args) {
            Queue<Integer> queue=new PriorityQueue<>();
            for (int i = 1; i <=10; i++) {
                queue.add(i);
            }
            while (!queue.isEmpty()){
                if(queue.peek()%2==0)
                {
                    System.out.println(queue.poll());
                    continue;
                }
                queue.poll();
            }
        }
    }


