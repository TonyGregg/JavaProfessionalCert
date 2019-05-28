package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by anton on 6/22/2018 6:44 PM
 **/
public class QueueDemo {

    private static void deQueueTest() {
        System.out.println("inside dequeue test");
        // Queue FIFO

        Deque<String > deque = new ArrayDeque<>();
        deque.add("Walden");
        deque.add("Harry Potter");
        deque.add("Head First Java");

        System.out.println("Printing queue");
        System.out.println(deque.remove()); // remove first
        System.out.println(deque.remove());
        System.out.println(deque.remove());

        System.out.println("---- --- --- -- - -- -");

        //Stack LIFO

        deque.push("Walden");
        deque.push("Harry Potter");
        deque.push("Head First design");

        System.out.println("Printing Stack");
        System.out.println(deque.pop()); // remove first
        System.out.println(deque.pop());
        System.out.println(deque.pop());

        System.out.println(deque.peek()); //null poll also returns null; remove & pop gives NoSuchElementException




    }

    public static void main(String[] args) {
        deQueueTest();
    }
}
