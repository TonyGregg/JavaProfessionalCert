package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by genil on 6/13/18 at 18 04
 **/
public class Duck implements Comparable<Duck> {
    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private  String name;


    @Override
    public int compareTo(Duck o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public    String toString() {
        return this.name;
    }


    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));

        Collections.sort(ducks);

        Collections.reverse(ducks);

        System.out.println(Collections.binarySearch(ducks,new Duck("Quack"),Comparator.comparing(Duck::getName)));

        ducks.removeIf((duck -> duck.getName().startsWith("Q")));


        ducks.forEach(System.out::println);
        BiFunction<String ,String, String > mapper = (s1,s2)->s1.length()>s2.length()?s1:s2;

    }
}
