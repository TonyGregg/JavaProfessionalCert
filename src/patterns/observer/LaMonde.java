package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 10
 **/
public class LaMonde implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("wine")) {
            System.out.println("Come let's celebrate weekend "+tweet);
        }
    }
}
