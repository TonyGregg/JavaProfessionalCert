package collections;

import java.util.PriorityQueue;

/**
 * Created by Antony Genil on 2019-06-13 at 08 22 for JavaProfessionalCert
 **/
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(1);
//        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(9);
        priorityQueue.add(7);
        priorityQueue.add(6);
        priorityQueue.add(-6);

        System.out.println("Peek ? "+priorityQueue.peek()); // 1
        System.out.println("Peek ? "+priorityQueue.peek()); // 1

        System.out.println("Poll ? "+priorityQueue.poll()); // 1
        System.out.println("Poll ? "+priorityQueue.poll()); // 4
        System.out.println("Poll ? "+priorityQueue.poll()); // 4



    }
}
