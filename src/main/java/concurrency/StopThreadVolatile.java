package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by anton on 6/21/2018 9:06 PM
 **/
public class StopThreadVolatile {
    private static volatile boolean stop;
    static int i=0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            while(!stop) {
                ++i;
                System.out.println("In a while...");
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        stop = true;

        System.out.println("All done !!" +i);

    }
}
