package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anton on 6/8/2018 5:03 AM
 **/
public class MethodReference {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","b","A","B");
        strings.sort((s1,s2)->s1.compareToIgnoreCase(s2));

        // easy way to sort

        strings.sort(String::compareToIgnoreCase);

        strings.forEach(System.out::println);


    }
}
