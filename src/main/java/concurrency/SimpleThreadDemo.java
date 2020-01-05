package concurrency;

/**
 * Created by Antony Genil on 2019-08-14 at 06 05 for JavaProfessionalCert
 **/
public class SimpleThreadDemo {
    private void executeMillionTimes() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Before sleep");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("After sleep");

        }
    }

    public static void main(String[] args) {
        SimpleThreadDemo demo = new SimpleThreadDemo();
        demo.executeMillionTimes();
        new Thread(() -> {
            int i = 23;
        }).start();
    }
}
