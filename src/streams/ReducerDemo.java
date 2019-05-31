package streams;

import java.util.Arrays;

/**
 * Created by Antony Genil on 2019-05-31 at 05 24 for JavaProfessionalCert
 *
 * Reduce is a terminal operation.
 *
 **/
public class ReducerDemo {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,8};
        int sum = Arrays.stream(nums).reduce(0,(a,b) -> a + b);

        // Integer has a static method sum, which makes it even more easier
        int sum1 = Arrays.stream(nums).reduce(0,Integer::sum);

        System.out.println("Total sum "+sum + " new way sum "+sum1);

        int mul = Arrays.stream(nums).reduce(1, (a, b) -> a * b);

        System.out.println("Mult : "+mul);

    }
}
