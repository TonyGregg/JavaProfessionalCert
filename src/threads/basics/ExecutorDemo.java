package threads.basics;

import java.util.concurrent.*;

/**
 * Created by anton on 6/10/2018 4:20 PM
 **/
public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = null;
        try{
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("It all begins here now .. .");
            executorService.execute(()-> System.out.println("Printing zoo inventory "));

           Future<?> future = executorService.submit(()-> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Zoo inv # "+i);
                }

            });

           future.get(500,TimeUnit.SECONDS);
            System.out.println("Reached");

            executorService.execute(()-> System.out.println("Printing another zoo inventory now"));
            System.out.println("End it man ");


        } finally {
            if(executorService!=null) {
                executorService.shutdown();
            }
        }
    }
}
