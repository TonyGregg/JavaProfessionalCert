package threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/11/18 at 14 38
 **/
public class ThreadAndExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(()-> {
            String name = Thread.currentThread().getName();
            System.out.println("Foo : " +name);
        });

        try {
            System.out.println("Trying to shut down..");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Task interrepted "+e.getMessage());

        }finally {
             if(!executorService.isTerminated()) {
                 System.out.println("some more un-finished tasks.. ");
             }
             executorService.shutdownNow();
            System.out.println("Shut down completed !");
        }

        if(executorService !=null) {
            executorService.shutdown();
        }
    }
}
