package threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static threads.ConcurrentUtils.sleep;
import static threads.ConcurrentUtils.stop;
import static threads.pricefinder.Util.*;
/**
 * Created by genil on 6/12/18 at 06 16
 **/
public class SemaphoreDemo {

    int counter = 0;

    Semaphore semaphore = new Semaphore(5);

    public static void main(String[] args) {
        SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        IntStream.range(0,100).forEach(i->executorService.submit(semaphoreDemo::doSemaPhoreDemo));
        boolean isShutDown = executorService.isShutdown();
        boolean isTerminated = executorService.isTerminated();

        System.out.printf("isShut down %s Terminated %sn ",isShutDown,isTerminated);

        stop(executorService);

        isShutDown = executorService.isShutdown();
        isTerminated = executorService.isTerminated();

        System.out.printf("isShut down %s Terminated %s%n ",isShutDown,isTerminated);
    }

    private void doSemaPhoreDemo() {
        System.out.println("Inside semaphore demo method "+ (++counter));
        boolean permit = false;

        try {
            permit = semaphore.tryAcquire(1,TimeUnit.SECONDS);
            if(permit) {
                System.out.println("Semaphore acquired !!");
                sleep(5);
            }else {
                System.out.println("Sorry.. could not acquire semaphore");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if(permit) {
                semaphore.release();
            }
        }

    }
}
