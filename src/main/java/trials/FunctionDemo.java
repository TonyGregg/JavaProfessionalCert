package trials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by genil on 2019-05-01 at 08 31
 **/
public class FunctionDemo {
    public static <R, T> List<R> map(List<T> list, Function<T, R> function) {

        List<R> result = new ArrayList<>();

        for (T t : list) {
            result.add(function.apply(t));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> integers = map(Arrays.asList("One", "Two","Threee","Foouur,"), (String::length));

        System.out.println(integers);
    }
}
