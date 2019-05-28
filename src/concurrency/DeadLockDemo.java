package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 7/2/18 at 05 06
 *  A deadlock is a state where two, or more, threads are blocked waiting for the other blocked waiting thread
 *  (or threads) to release a lock thus none of the threads will ever complete.
 *  Therefore, each thread needs to obtain more than one lock, and they only manage to obtain some of the locks
 *  (but not all of them). For a deadlock to take place we need to have more than one thread and
 *  each of these threads needs to obtain more than one lock and the same locks are required by more than one thread.
 *
 * Let say that thread-A needs to obtains two locks, lock-X and lock-Y. It first acquires lock-X and then
 * acquires lock-Y. When ready, thread-A releases the locks in the reverse order these were acquired
 **/
public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResources sharedResources = new SharedResources("Resource 1","Resource 2");
        List<Integer> integers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Thread thread1 = new Thread(new Worker1(integers,sharedResources));
        Thread thread2 = new Thread(new Worker2(integers,sharedResources));

        thread1.setName("Worker 1");
        thread2.setName("Worker 2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}

class Worker1 implements Runnable {

    public Worker1(List<Integer> integers,  SharedResources sharedResources) {
        this.integers = integers;
        this.sharedResources = sharedResources;
    }

    List<Integer> integers;
    SharedResources sharedResources;

    @Override
    public void run() {
        synchronized (sharedResources.resource1) {
            System.out.println(Thread.currentThread().getName()+" Acquired lock on resource 1 ..");
            double d = new AverageCalculator().caculateAverage(integers);
            System.out.println(Thread.currentThread().getName()+ " Average "+d);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" Waiting to acquire lock on resource 2 ..");
            synchronized (sharedResources.resource2) {
                System.out.println(Thread.currentThread().getName()+" Acquired both the locks ..");

            } // end sync resource 2

        } // end synchronized resource 1

        System.out.println(Thread.currentThread().getName()+" released both the locks ..");



    } //end run
}

class Worker2 implements Runnable {
    public Worker2(List<Integer> integers,  SharedResources sharedResources) {
        this.integers = integers;
        this.sharedResources = sharedResources;
    }

    List<Integer> integers;
    SharedResources sharedResources ;


    @Override
    public void run() {
        synchronized (sharedResources.resource2) {
            System.out.println(Thread.currentThread().getName()+" Acquired lock on resource 2 ..");
            double d = new AverageCalculator().caculateAverage(integers);
            System.out.println(Thread.currentThread().getName()+ " Average "+d);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" Waiting to acquire lock on resource 1 ..");
            synchronized (sharedResources.resource1) {
                System.out.println(Thread.currentThread().getName()+" Acquired both the locks ..");

            } // end sync resource 2

        } // end synchronized resource 1

        System.out.println(Thread.currentThread().getName()+" released both the locks ..");
    } //end run
}

class SharedResources {
    public SharedResources(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    final String resource1,resource2;
}
