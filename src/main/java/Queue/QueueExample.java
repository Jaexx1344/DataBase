package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Adam");
        queue.offer("Michał");
        queue.offer("Damian");

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.offer("Jurek");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
