package threads.basics;

/**
 * Created by anton on 6/10/2018 3:50 PM
 **/
public class CheckResult {
    private static int counter =0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()-> {
            for (int i = 0; i < 500; i++) {
                counter++;
                System.out.println("Broom. . broom ......"+i + " Counter "+counter );
            }
        }).start();

        while(counter<100) {
            System.out.println("Not reached yet");
            Thread.sleep(50L);
        }

        System.out.println("Reached !!");

    }
}
