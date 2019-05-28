package threads.basics;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by genil on 6/10/18 at 18 53
 **/
public class AddData {
    public static void main(String[] args) {
        ExecutorService executorService = null;

        executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(()->300+2);

        try {
            System.out.println("Output "+integerFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            if(executorService !=null) {
                executorService.shutdown();
            }
        }

    }
}
