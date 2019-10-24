package chap3.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 3/5/19 at 23 25
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Elisha");
        strings.add("Jotham");
//        strings.set(20, "Tony"); // IndexOutOfBoundsException : 20 out of bounds for length 2

        Giraffee giraffee = new Giraffee();

        System.out.println(strings.contains(giraffee)); // false

    }
}
