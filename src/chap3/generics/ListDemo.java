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

        Giraffee giraffee = new Giraffee();

        System.out.println(strings.contains(giraffee));

    }
}
