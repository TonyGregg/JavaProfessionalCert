package lambda;

import org.genil.learning.java8.collections.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PredicateTester {
    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        System.out.println("Inside filterApples method "+inventory.size());
        List<Apple> resultList = new ArrayList<>();

        for (Apple apple: inventory) {
            if(predicate.test(apple)) {
                resultList.add(apple);
            } // end if
        } // end for each
        return resultList;
    } // end filter apple

    public static void prettyPrintApple(List<Apple> apples, AppleFormatter applePrettyPrinter) {
        apples.forEach(apple -> {
            String output = applePrettyPrinter.printStylishly(apple);
            System.out.println(output);
        });
    }

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        Apple apple = new Apple("green",1);
        inventory.add(apple);

        apple = new Apple("red",1);
        inventory.add(apple);

        apple = new Apple("ora",10);
        inventory.add(apple);

        apple = new Apple("green",21);
        inventory.add(apple);

        apple = new Apple("red",100);
        inventory.add(apple);

        apple = new Apple("red",20);
        inventory.add(apple);


        System.out.println("Going to filter the apples by color :: Green first");
        List<Apple> greenApples = filterApples(inventory,Apple::isGreenApple);
        System.out.println("Green apples are filtered..");

        for (Apple apple1: greenApples ) {
            System.out.println(apple1);
        }

        List<Apple> heavyApples = inventory.parallelStream().filter((Apple a) ->
            a.getWeight()>25).collect(Collectors.toList());

        List<Apple> heavyApples2 = filterApples(inventory, (Apple appldde) -> appldde.getWeight()<200);

        // one another way !!

        List<Apple> heavyApples322 = filterApples(inventory, Apple::isHeavyApple);


        System.out.println("Heavy apples !");
        for (Apple heavyApple: heavyApples) {
            System.out.println(heavyApple);
        }


        List<Apple> defaultHeavyApples = inventory.parallelStream().filter(Apple::isHeavyApple).collect(Collectors.toList());

        System.out.println("printing default Heavy apples method !");

        for ( Apple defaultHeavy: defaultHeavyApples) {
            System.out.println(defaultHeavy);
        }

        System.out.println("### Printing in style ## ");
        System.out.println("");
        prettyPrintApple(inventory,new AppleDottedPrinter());




    }// end main
} // end class

