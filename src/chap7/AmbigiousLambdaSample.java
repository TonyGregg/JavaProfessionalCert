package chap7;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by Antony Genil Gregory on 10/27/2019 6:19 PM
 * For project : JavaProfessionalCert
 **/
public class AmbigiousLambdaSample {
    public static void useCallable(Callable<Integer> integerCallable) {}
    public static void useSupplier(Supplier<Integer> integerSupplier) {}

    public static void main(String[] args) {
        useCallable(() -> {
            throw new IOException();
        });
        useSupplier(() -> {
//            throw new IOException(); // does not compile
            return 20;
        });
    }

}
