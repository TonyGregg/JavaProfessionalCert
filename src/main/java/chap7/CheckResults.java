package chap7;

/**
 * Created by Antony Genil Gregory on 10/27/2019 9:49 AM
 * For project : JavaProfessionalCert
 **/
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException{
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter++;
            }
        }).start();
        while (CheckResults.counter < 100) {
            System.out.println("not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached");
    }
}
