package trials;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));


    public static void main(String[] args) {

        //Get the 3 most caloricDish Names

        List<String> threeHighCaloricDishes = menu.stream().filter((Dish d) -> d.calories >= 400).
                map(Dish::getName).
                limit(3).collect(toList());


        System.out.println(threeHighCaloricDishes);


        List<String> threeHighCaloricDishes1 = menu.stream().filter((Dish d) -> d.calories > 500).
                limit(3).
                map(Dish::getName).
                collect(toList());

        System.out.println(threeHighCaloricDishes1);

        // Get the length of all dish names

        List<Integer> dishNameLengths = menu.stream().
                map(Dish::getName).
                map(String::length).collect(toList());

        System.out.println(dishNameLengths);

        // flatMap - flattens each generated stream into a single stream

        String[] words = {"Hello","World"};

        List<String>uniqueChars =  Arrays.stream(words).map(word -> word.split("")).
                flatMap(Arrays::stream).
                distinct().collect(toList());


        System.out.println(uniqueChars);


    }
}