package patterns.observer;

/**
 * Created by Antony Genil Gregory on 5/5/2019 12:00 PM
 * For project : JavaProfessionalCert
 **/
public class NYTimes implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet !=null && tweet.contains("money")) {
            System.out.println("Breaking news from NY ! "+tweet);
        }
    }
}
