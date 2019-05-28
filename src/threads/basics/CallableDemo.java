package threads.basics;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by genil on 6/11/18 at 14 54
 **/
public class CallableDemo {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("callable thread.. . ");
          return 23;
        };

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future =  service.submit(task);

        System.out.println("Future done ?? "+future.isDone());
        Integer output = future.get();

        System.out.println("Result output "+output);


        TimeUnit.SECONDS.sleep(3);

        System.out.println("Done executing .. ");

        CallableDemo callableDemo = new CallableDemo();
        callableDemo.doCallDemo();
    }

    private void doCallDemo() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

//        Future<Integer> integerFuture = executorService.submit(()->this.returnRandomNumber());
        //simplified
        Future<Integer> integerFuture = executorService.submit(this::returnRandomNumber);

        try {
            System.out.println("Output from random "+integerFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdownNow();
        }

    }

    private Integer returnRandomNumber() {

        System.out.println("inside return randmon number function. . ");
        Random random = new Random();
        return random.nextInt(200);

    }

}
