package day18_5_10.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("홍길동");
        queue.offer("박문수");

        queue.add("임꺽정");

        System.out.println(queue);
        System.out.println(queue.size());

        // poll() 먼저넣은거 빠짐
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.size());
        
    }
}
