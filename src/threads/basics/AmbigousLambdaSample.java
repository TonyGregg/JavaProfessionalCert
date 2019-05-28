package threads.basics;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by genil on 6/10/18 at 18 43
 **/
public class AmbigousLambdaSample {

    private static void useCallable(Callable<Integer> integerCallable) {
        try {
            integerCallable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("INside use callable. .."+integerCallable);

    }
    public static void useSupplier(Supplier<Integer> integerSupplier) {

    }
    public static void use(Callable<Integer> integerCallable) {

    }
    public static void use(Supplier<Integer> integerSupplier) {

    }

    public static void main(String[] args) {
        useCallable(()-> {
            System.out.println("something callable. . ");
//            throw new IOException();
            return 520;
        });

        useCallable(()-> {
            System.out.println("Another callable .. .invoke ");
            return 98;
        });
    }


}
