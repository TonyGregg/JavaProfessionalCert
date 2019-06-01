package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * Created by Antony Genil on 2019-05-31 at 05 24 for JavaProfessionalCert
 *
 * Reduce is a terminal operation.
 *
 **/
public class ReducerDemo {
    public static void main(String[] args) {

        int[] nums = {1,2,3,40,5,6,8};
        int sum = Arrays.stream(nums).reduce(0,(a,b) -> a + b);

        // Integer has a static method sum, which makes it even more easier
        int sum1 = Arrays.stream(nums).reduce(0,Integer::sum);

        System.out.println("Total sum "+sum + " new way sum "+sum1);

        int mul = Arrays.stream(nums).reduce(1, (a, b) -> a * b);

        System.out.println("Mult : "+mul);

        OptionalInt max = Arrays.stream(nums).reduce(Integer::max);

        if (max.isPresent()) {
            System.out.println("max : "+max.getAsInt());
        }

        /**
         * Count # of dishes
         */

        List<Dish> dishes = Dish.getMenu();

        Optional<Integer> nDishHighCal = dishes.stream()
                .filter(dish -> dish.getCalories()>500)
                .map(dish -> 1)
                .reduce(Integer::sum);


        // btw.. there is an easy way, just to remind. The above is to show case reduce

        long nHighCalCount = dishes.stream()
                .filter(d -> d.getCalories() > 500)
                .count();

        System.out.println("# of dishes having calorie more " +
                "than 500 : "+ nDishHighCal.get() +" nHighCalCount " +nHighCalCount);




    }
}
