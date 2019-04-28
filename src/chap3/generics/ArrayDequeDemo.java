package chap3.generics;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by genil on 3/11/19 at 23 24
 **/
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Queue<Integer> integers = new ArrayDeque<>();

        integers.add(1); // adds back of the queue, returns true or throws an exception
        integers.add(12);
//        [1,12]
        System.out.println(integers.element()); // throws exception on empty queue

        integers.offer(3); // [1,12,3]. No exception

        System.out.println(integers.remove()); // 1, [12,13]
        System.out.println(integers.remove()); // 12, [13] throws exception on empty queue

        integers.offer(4); //[13,4]

        Integer x = 200;

        ((ArrayDeque<Integer>) integers).push(x); // adds an element to the front of the queue. [200,13,4]

        // poll removes and returns next element or returns null if an empty queue

        System.out.println(integers.poll()); // 200 [13,4]




    }
}
