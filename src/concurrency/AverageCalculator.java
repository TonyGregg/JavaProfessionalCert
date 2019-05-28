package concurrency;

import java.util.List;

/**
 * Created by genil on 7/1/18 at 21 21
 **/
public class AverageCalculator {
    public double caculateAverage(final List<Integer> integers) {
        Integer sum = 0;

        for(Integer integer:integers) {
            sum = sum + integer;
        }


        return sum/integers.size();

    }
}
