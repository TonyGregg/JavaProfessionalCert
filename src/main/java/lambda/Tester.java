package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class Tester {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        Collections.addAll(words,"Category","Anton","Girafeeeee","Ink","Zoo","Orange");

        for (String word: words) {
            System.out.println(word);
        }

        //sort now
        sortWords(words);
        System.out.println("After sorting ...");
        for (String word: words) {
            System.out.println(word);
        }


    }

    private static void sortWords(List<String> words) {
        // Soring using Lambda expression
//        Collections.sort(words,(s1,s2) -> Integer.compare(s1.length(),s2.length()));

//        Collections.sort(words, comparingInt(String::length));

        // even more shorter
        words.sort(comparingInt(String ::length));

    }
}
