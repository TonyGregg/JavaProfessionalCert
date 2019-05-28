package concurrency;

/**
 * Created by genil on 6/21/18 at 13 26
 **/
public class MyFirstThread {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);

        thread.start();

        System.out.println("Inside main method..");

    }

}

class Task implements Runnable {

    String currentThreadNameInstance = Thread.currentThread().getName();

    @Override
    public void run() {
        System.out.println("Inside run. .."+currentThreadNameInstance+ " "+Thread.currentThread().getName());
        walk();
    }

    private void go() {
        System.out.println("Running. .. "+currentThreadNameInstance+ " "+Thread.currentThread().getName());
//        walk();
    }

    private void walk() {
        System.out.println("I am walking slowly."+currentThreadNameInstance+ " "+Thread.currentThread().getName());
        go();
    }
}
