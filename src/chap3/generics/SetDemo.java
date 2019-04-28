package chap3.generics;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by genil on 3/7/19 at 22 17
 **/
public class SetDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> integers = new TreeSet<>();

        for (int i = 1; i <= 20; i++) {
            integers.add(i);
        }

        // lower - returns the greatest element less than e

        System.out.println(integers.lower(10)); // 9

        System.out.println(integers.lower(30)); // 20

        System.out.println(integers.lower(1)); // null

        // floor - returns the greatest element less than or equals to e

        System.out.println("...... floor ..........");

        System.out.println(integers.floor(10)); // 10
        System.out.println(integers.floor(1)); // 1
        System.out.println(integers.floor(0)); // null

        System.out.println("...... ...... ceiling ............");

        // ceiling - returns smallest element that is >= e
        System.out.println(integers.ceiling(15)); // 15
        System.out.println(integers.ceiling(21)); // null

        // higher - returns smallest element that is greater > e or null


        System.out.println("......... higher ............");

        System.out.println(integers.higher(15)); // 16
        System.out.println(integers.higher(18)); // 19
        System.out.println(integers.higher(20)); // null





    }
}
