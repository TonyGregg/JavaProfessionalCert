package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Antony Genil on 2019-05-29 at 06 26 for JavaProfessionalCert
 *
 * Immutable Dish
 *
 **/
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

    @Override

    public String toString() {
        return name;
    }

    public enum Type {MEAT, FISH, OTHER}

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("Prawns", false, 300, Dish.Type.FISH),
                new Dish("Shrimps", false, 600, Dish.Type.FISH),
                new Dish("Salmon", false, 450, Dish.Type.FISH));

        // play with streams
        // Get my favorite dish - Fish types !
        List<Dish> fishDishes = menu.stream()
                .filter(dish -> dish.type.equals(Type.FISH))
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());

//        System.out.println(fishDishes);
        //other way to print
        fishDishes.forEach(System.out::println);

        // Group by example

        Map<Type, List<Dish>> dishesByType = menu.stream()
                                                .collect(Collectors.groupingBy(Dish::getType));
    }



}