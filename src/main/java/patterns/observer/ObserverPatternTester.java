package patterns.observer;

/**
 * Created by Antony Genil Gregory on 5/5/2019 12:08 PM
 * For project : JavaProfessionalCert
 **/
public class ObserverPatternTester {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new NYTimes());
        feed.registerObserver(new Guardian());
        feed.registerObserver(new LeMonde());

//        feed.notifyObservers("The queen said her favorite book is Java 8 in Action. Cheers ! wine !");

        // Java 8 way

        feed.registerObserver((String str) -> {
            if(str != null && str.contains("money")) {
                System.out.println("Lambda !! Breaking news in NY "+str);
            }
        });


        feed.registerObserver((String str) -> {
            if(str != null && str.contains("queen")) {
                System.out.println("Lambda !! Yet another java 8 way in London "+str);
            }
        });


        feed.notifyObservers("The queen said her favorite book is Java 8 in Action. Cheers ! wine !");


    }
}
