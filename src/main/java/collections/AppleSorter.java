package collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 6/7/2018 5:14 PM
 **/
public class AppleSorter {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        Apple apple = new Apple("green", 80);
        inventory.add(apple);

        apple = new Apple("red", 1);
        inventory.add(apple);

        apple = new Apple("ora", 10);
        inventory.add(apple);

        apple = new Apple("green", 21);
        inventory.add(apple);

        apple = new Apple("red", 100);
        inventory.add(apple);

        apple = new Apple("red", 20);
        inventory.add(apple);

        // Sort approach # 1


        /*inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        inventory.forEach(apple1 -> System.out.println(apple1) );*/


        // Approach # 2

        inventory.sort((Apple apple1, Apple apple2) ->  apple1.getWeight().compareTo(apple2.getWeight()));
    }
}
