package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by anton on 6/9/2018 10:26 AM
 **/
public class MenuStreamDemo {

    public static void main(String[] args) {
        ArrayList<Menu> menus = getMenus();

        // Java 8 stream way

        /**
         * Filter calories over 500 and sort by the price, get only the menu names
         */

        List<String> highCalorieDishNames = menus.stream()
                .filter(m->m.getCalories()>100)
                .sorted(comparing(Menu::getPrice))
                .limit(20)
                .map(Menu::getName)
                .collect(toList());

        OptionalInt maxCalorie = menus.stream().mapToInt(Menu::getCalories).max();
        System.out.println(maxCalorie.isPresent()+ " "+maxCalorie.getAsInt());

        highCalorieDishNames.forEach(System.out::println);

        System.out.println("## give a break and stream !!");

        Stream<String> stringStream = highCalorieDishNames.stream();

        stringStream.forEach(System.out::println);

//        stringStream.forEach(System.out::println); // YOu can stream just only once !! This line will fail if enabled
        //IllegalStateException : stream already has been operated or closed

    }

    private static ArrayList<Menu> getMenus() {
        ArrayList<Menu> menus = new ArrayList<>();

        Menu menu = new Menu("Parotta",150,3.0f);
        menus.add(menu);

        menu = new Menu("Kothu Parotta",600,6.0f);
        menus.add(menu);

        menu = new Menu("Mutton Curry",502,15.0f);
        menus.add(menu);

        menu = new Menu("Goat Biryani",700,17.0f);
        menus.add(menu);

        menu = new Menu("Mutton Chuka",60,12.0f);
        menus.add(menu);

        menu = new Menu("Dhal Makhini",250,12.0f);
        menus.add(menu);


        return menus;
    }
}
