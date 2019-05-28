package threads.basics;

import threads.ConcurrentUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static threads.ConcurrentUtils.stop;


/**
 * Created by genil on 6/11/18 at 21 53
 **/
public class SynchronizedDemo {

    int counter =0;

    private void incrementCounter() {
        counter++;
        try {
            synchronized (this) {
                TimeUnit.MILLISECONDS.sleep(1);
            }

//            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();

        ExecutorService executorService = Executors.newFixedThreadPool(6);

//        executorService.submit(synchronizedDemo::incrementCounter);
        IntStream.range(0,500)
                .forEach(i->executorService.submit(synchronizedDemo::incrementCounter));

        stop(executorService);

        System.out.println("Counter "+synchronizedDemo.counter);

    }
}
