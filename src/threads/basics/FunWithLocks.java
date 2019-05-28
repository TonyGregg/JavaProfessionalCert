package threads.basics;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static org.genil.learning.java8.threads.ConcurrentUtils.sleep;
import static org.genil.learning.java8.threads.ConcurrentUtils.stop;

/**
 * Created by genil on 6/12/18 at 05 21
 **/
public class FunWithLocks {
    HashMap<Integer,String> ragasiyam = new HashMap<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        FunWithLocks funWithLocks = new FunWithLocks();

        executorService.submit(funWithLocks::doWriteLock);
        executorService.submit(funWithLocks::doReadLock);
        executorService.submit(funWithLocks::doReadLock);

        stop(executorService);

    }

    /**
     *  Demo write lock
     */
    private void doWriteLock() {
        readWriteLock.writeLock().lock();
        try {
            System.out.println("Entering write lock. Going to nap for 1 sec");
            sleep(1);
            ragasiyam.put(1,"Enna pannura");
            ragasiyam.put(2,"Onnum pannala");
            System.out.println("Nap done, data also inserted ");

        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    private void doReadLock() {
        readWriteLock.readLock().lock();
        try{

            System.out.println(ragasiyam.get(1));
            System.out.println(ragasiyam.get(2));
        }finally {
            readWriteLock.readLock().unlock();
        }

    }




}
