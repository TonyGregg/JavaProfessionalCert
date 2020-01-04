package chap4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reconciler {

    Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending, Stream<Stream<ProcessedTransaction>> processed) {
        Stream pendingTrxList = Stream.empty();
        
        if (pending == null || processed == null ) { //Check for nul..
            return pendingTrxList; // empty stream? Stream
        }

        pendingTrxList =  processed.flatMap(Function.identity()).
                filter(processeds-> processeds.getStatus() != null
                        && processeds.getStatus().equalsIgnoreCase("Done"));

        
        return pendingTrxList;
        
    }

    private void tryStringFlat() {
        String[] words = {"Hello","World"};
        Stream<String> wordStream = Arrays.stream(words);

        List<String> uniqueLetters = wordStream
                .map(string -> string.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        /**
         * Given a list of numbers, how would you return a list of the square of each number?
         * For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16, 25].
         */

        Integer[] nums = {1,2,3,4,5};

        Stream<Integer> integerStream = Arrays.stream(nums);

        List<Integer> squaureInts = integerStream
                .map(n-> n*n)
                .collect(Collectors.toList());



    }


    public static void main(String[] args) {
        Reconciler reconciler = new Reconciler();
        reconciler.tryStringFlat();

    }

}