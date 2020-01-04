package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/21/18 at 06 42
 **/
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue(20);
        new Thread(new Producer(blockingQueue)).start();
        new Thread((new Consumer(blockingQueue))).start();

    }
}

class Producer implements Runnable {

    public Producer(BlockingQueue<Integer> sharedQueue) {

        this.sharedQueue = sharedQueue;
    }

    private final BlockingQueue<Integer> sharedQueue;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("I am producing. .. "+i);

                sharedQueue.put(i);
                System.out.println("test.. test.. produce");
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // end of for

        try {
            sharedQueue.put(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    public Consumer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    private final BlockingQueue<Integer> sharedQueue;

    @Override
    public void run() {
        Integer output = 0;
        while(output!=200) {
            try {
                output = sharedQueue.take();
                System.out.println("I am consuming .."+output);
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
