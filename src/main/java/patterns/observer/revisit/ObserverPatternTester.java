package patterns.observer.revisit;

/**
 * Created by Antony Genil Gregory on 1/22/2020 3:09 AM
 * For project : JavaProfessionalCert
 **/
public class ObserverPatternTester {
    public static void main(String[] args) {
        Feed feed = new Feed();
        // Java 8 way
        // Washington post
        feed.addObserver(tweet -> {
           if (tweet.contains("Trump")) {
               System.out.println("Post post. .."+tweet);
           }
        });

    }


}
