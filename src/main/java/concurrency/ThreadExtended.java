package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/21/18 at 13 48
 **/
public class ThreadExtended extends Thread {

    public void run() {
        System.out.println("Inside run. ..");
        walk();
    }

    private void go() {
        System.out.println("Running. .. ");
    }

    private void walk() {
        System.out.println("I am walking slowly.");
        go();
    }

    public static void main(String[] args) {
        ThreadExtended threadExtended = new ThreadExtended();
        threadExtended.start();

//        threadExtended.start();  // starting again will result in runtime error
        System.out.println("Inside main method");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I woke up from sleep ...in main. ..");
    }
}
