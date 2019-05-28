package concurrency;

/**
 * Created by genil on 6/21/18 at 14 14
 **/
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread thread1 = new Thread(new EmailCampaign());
        Thread thread2 = new Thread(new Task());

        thread1.setName("EmailCampaign");
        thread2.setName("DataAggregator");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        System.out.println("Going to join .. .");
        try {
            thread1.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main completed ");

    }
}

class EmailCampaign implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
            if(i%10==0) {
                System.out.println("I am going to yield to others");
                Thread.currentThread().yield();
            }
        }
    }
}
