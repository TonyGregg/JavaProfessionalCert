package threads.streams;

import java.util.Arrays;

/**
 * Created by genil on 6/12/18 at 15 41
 **/
public class ParallelFunStream {
    public static void main(String[] args) {
        Arrays.asList("1","2","3","4","5","#","6","7").stream().forEach(System.out::print);
//        Arrays.asList("1","2","3","4","5","#","6","7").parallelStream().forEach(System.out::print);
        Arrays.asList("1","2","3","4","5","#","6","7").parallelStream().forEachOrdered(System.out::print);
    }
}
