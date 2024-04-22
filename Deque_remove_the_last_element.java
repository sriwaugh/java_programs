package java_program;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Deque_remove_the_last_element {
    public static void main(String[] args) {
        Queue<Integer> deq=new PriorityQueue<>();
        deq.add(20);
        deq.add(30);
        deq.add(40);
        deq.add(50);
        deq.add(60);
        deq.add(70);
        Queue<Integer> de1=new PriorityQueue<>();
        int a=deq.size();
        for (int i = 0; i < a-1; i++) {
            de1.add(deq.poll());
        }
        Iterator<Integer> it=de1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}


