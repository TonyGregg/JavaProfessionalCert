package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.TimeUnit.SECONDS;

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
public class DeadLockSolver {
    public static void main(String[] args) throws InterruptedException {
        SharedResources sharedResources = new SharedResources("Resource 1","Resource 2");
        List<Integer> integers = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        Thread thread1 = new Thread(new Worker3(integers,sharedResources));
        Thread thread2 = new Thread(new Worker4(integers,sharedResources));

        thread1.setName("Worker A");
        thread2.setName("Worker B");

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();
    }

}

class Worker3 implements Runnable {

    public Worker3(List<Integer> integers,  SharedResources sharedResources) {
        this.integers = integers;
        this.sharedResources = sharedResources;
    }

    List<Integer> integers;
    SharedResources sharedResources;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            if(lock.tryLock(1,TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName()+" Acquired lock on resource 1 ..");
                double d = new AverageCalculator().caculateAverage(integers);
                System.out.println(Thread.currentThread().getName()+ " Average "+d);
                try {
                    SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" Waiting to acquire lock on resource 2 ..");
                try {
                    lock.tryLock (2, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
                {
                    System.out.println(Thread.currentThread().getName()+" Acquired both the locks ..");

                } // end sync resource 2

            } // end synchronized resource 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        System.out.println(Thread.currentThread().getName()+" released both the locks ..");



    } //end run
}

class Worker4 implements Runnable {
    public Worker4(List<Integer> integers,  SharedResources sharedResources) {
        this.integers = integers;
        this.sharedResources = sharedResources;
    }

    List<Integer> integers;
    SharedResources sharedResources ;

    Lock lock = new ReentrantLock();



    @Override
    public void run() {
        try {
            if(lock.tryLock (10,TimeUnit.MICROSECONDS)) {
                System.out.println(Thread.currentThread().getName()+" Acquired lock on resource 2 ..");
                double d = new AverageCalculator().caculateAverage(integers);
                System.out.println(Thread.currentThread().getName()+ " Average "+d);
                try {
                    SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" Waiting to acquire lock on resource 1 ..");
                try {
                    if(lock.tryLock (1,TimeUnit.SECONDS)){
                        System.out.println(Thread.currentThread().getName()+" Acquired both the locks ..");

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            } // end synchronized resource 1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        System.out.println(Thread.currentThread().getName()+" released both the locks ..");
    } //end run
}

