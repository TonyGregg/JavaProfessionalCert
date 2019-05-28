package threads;

import java.util.concurrent.*;

/**
 * Created by Antony G Gregory on 6/9/2018 5:10 PM
 **/
public class BasicThread {

    private static void doSomethingElse() {

        try {
            System.out.println("let me sleep for .5 secs");
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    private static Double doSomeCalculation() {
        Double result = null;
        for (int i = 2000;i<3000;i++) {
            System.out.println("Doing Real caculation  "+ (i*5));
            result = i * 20.0;
        }
        return result;
    }

    public static void main(String[] args) {

        // Executor service from Executors !
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 2. Submit a callbale to executor service

        Future<Double> future = executorService.submit(() -> {
            return doSomeCalculation();
        });

        doSomethingElse();

        try {
            Double result = future.get(1, TimeUnit.SECONDS);

            System.out.println("\n\n\n\n ####### #### ### \n\n\n\n #### \nResult "+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }


    }
}
