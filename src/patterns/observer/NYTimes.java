package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 08
 **/
public class NYTimes implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("money")) {
            System.out.println("Breaking news in NY times "+tweet);
        }
    }
}
