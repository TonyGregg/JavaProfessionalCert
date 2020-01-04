package threads.basics;

import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/11/18 at 14 32
 **/
public class ThreadAndRunnable {

public static void main(String[] args) {
        Runnable runnable = () -> {
          String name = Thread.currentThread().getName();
          System.out.println("Foo : " +name);


            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Bar : "+name);


        };

        runnable.run();

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Done");
    }
}
