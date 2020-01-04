package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CollectionReviewer {
    public static void main(String[] args) {
        String[] array = {"gervin","mouse"};
        List<String> list = new ArrayList<>();
/*        list.set(1,"test");

        array[0] = "new";

        for (String string: list) {
            System.out.println(string);
        }

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));

        numbers.remove(1);
        numbers.remove(new Integer(5));

        System.out.println(numbers);*/

        list.add("Lion");

        System.out.println("Size "+list.size());

        list.add(1,"Panda");
        System.out.println("Size "+list.size());
        System.out.println(list);

        experimentQueus();
        experimentStack();
    }

    private static void experimentQueus() {
        System.out.println("------ - -- -");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.add(4);
        queue.offer(20);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("------------------------");
    }

    private static void experimentStack() {
        System.out.println("------ - -- -");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.push(10);
        queue.add(4);
        queue.push(20);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("------------------------");
    }




}
