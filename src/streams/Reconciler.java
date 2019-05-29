package streams;

import java.util.function.Function;
import java.util.stream.Stream;

class Reconciler {

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

}