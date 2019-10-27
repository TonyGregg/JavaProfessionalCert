package chap4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by Antony Genil on 2019-10-25 at 17 54 for JavaProfessionalCert
 **/
public class StreamDemo {
    public static void main(String[] args) {
//        createStreams();
        doStreamOperations();
    }

    private static void doStreamOperations() {
        // min & max
        Stream<String> stringStream = Stream.of("monkey","ape","Zeebra");
        Optional<String> minString = stringStream.min(Comparator.comparingInt(String::length));
        minString.ifPresent(System.out::println);

        // reduce
        Stream<String> stringStream1 = Stream.of("w","o","l","f");
        String word = stringStream1.reduce("", String::concat);
        System.out.println(word);

        BinaryOperator<Integer> binInteger = (x, y) -> x * y;
        Stream<Integer> integerStream = Stream.empty();
        integerStream.reduce(binInteger).ifPresent(System.out::println);
        integerStream = Stream.of(2,3,15);

        integerStream.reduce(binInteger).ifPresent(System.out::println);

        // filter
        Stream<String> stringStream2 = Stream.of("monkey","ape","Zeebra");
        stringStream2.filter(s -> s.startsWith("m")).forEach(System.out::println);

        // limit and skip
        Stream<Integer> integerStream1 = Stream.iterate(1, n -> n + 1);
        integerStream1.skip(9).limit(2).forEach(x -> {System.out.print(x + ",");});

        // map
        Stream<String> stringStream3 = Stream.of("One","Two",
                "Three","Four","Five","Six....","Seven...");
         integerStream = stringStream3.map(String::length);
        System.out.println("Mapped.. ");
         integerStream.forEach(x -> System.out.print(" "+x));
        System.out.println("\nFlatMap demo");
         // flat map
        String[][] data = new String[][]{{"a", "b"}, {"c", "d","a"}, {"e", "f","a"}};
        Stream<String[]> streamStrArray = Arrays.stream(data);
        stringStream2 = streamStrArray.flatMap(x -> Arrays.stream(x)); // flat map to Stream<String>
        stringStream2.filter(s -> "a".equalsIgnoreCase(s)).forEach(System.out::println);





    }

    private static void createStreams() {
        // empty stream
        Stream<String> stringStream = Stream.empty(); // count 0
        // one stream
        Stream<Integer> oneStream = Stream.of(1); // 1

        // multiple
        Stream<Integer> multiples = Stream.of(1, 2, 3); // 3

        System.out.println(oneStream.count() + " multiples count "+multiples.count());

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
    }
}
