package chap2;

import java.util.function.Predicate;

/**
 * Created by genil on 2/20/19 at 06 27
 **/
public class PredicateDemo {


}


class Panda {
    int age;
    private static void check(Panda panda, Predicate<Panda> pred) { // h2
        String result = pred.test(panda) ? "match" : "not match"; // h3
        System.out.print(result);
    }

    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.age = 1;
        check(panda, panda1 -> panda1.age<5);
    }
}
