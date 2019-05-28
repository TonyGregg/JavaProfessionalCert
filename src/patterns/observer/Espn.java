package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 09
 **/
public class Espn implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("tennis")) {
            System.out.println("Federer news probably? "+tweet);
        }
    }
}
