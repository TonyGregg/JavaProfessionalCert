package patterns.observer;

/**
 * Created by Antony Genil Gregory on 5/5/2019 12:00 PM
 * For project : JavaProfessionalCert
 **/
public class LeMonde implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet !=null && tweet.contains("wine")) {
            System.out.println("Today cheese, wine and news ! "+tweet);
        }
    }
}
