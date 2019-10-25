package chap3.generics;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Antony Genil on 2019-10-24 at 18 15 for JavaProfessionalCert
 **/
public class Java8Additions {
    public static void main(String[] args) {
        /**
         * removeIf demo
         */

        List<String> strings = new ArrayList<>();
        strings.add("Magician");
        strings.add("Assistant");
        strings.add("Managers");
        strings.add("Players");

        System.out.println(strings);
        strings.removeIf(s -> s.startsWith("A"));
        System.out.println(strings);
        // updating all elements  - replace all

        List<Integer> integers = Arrays.asList(1,2,3,4);
        System.out.println(integers);
        integers.replaceAll(x -> x * 4);
        System.out.println(integers);

        // looping through a collection

//        strings.forEach(s -> System.out.println(s));
        // another simpler way
        strings.forEach(System.out::println);

//        integers.forEach(integer -> System.out.println(integer));

        // merge
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String > favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tours");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skiride", mapper);
        String tom = favorites.merge("Tom","Skiride", mapper);

        System.out.println(favorites);
        System.out.println(jenny); // Bus Tours
        System.out.println(tom); // Skiride

        // Supplier demo
        Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();
        Supplier<LocalDate> localDateSupplier2 = LocalDate::now;

        LocalDate localDate = localDateSupplier.get();
        System.out.println(localDate);
        localDate = localDateSupplier2.get();
        System.out.println(localDate);

        // Consumer Demo
        Consumer<Squirrel> squirrelConsumer = System.out::println;
        squirrelConsumer.accept(new Squirrel());

        //Bi predicate
        BiPredicate<String, String > stringBiPredicate = String::startsWith;
        BiPredicate<String, String > stringBiPredicate2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println("Bi predi res : "+stringBiPredicate.test("Chicken","Chic"));

    }
}
