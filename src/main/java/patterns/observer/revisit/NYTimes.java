package patterns.observer.revisit;

/**
 * Created by Antony Genil Gregory on 1/22/2020 3:03 AM
 * For project : JavaProfessionalCert
 **/
public class NYTimes implements Observer {
    @Override
    public void tweet(String tweet) {
        if (tweet.contains("money")) {
            System.out.println("Headline NYT..Money " + tweet);
        }
    }
}
