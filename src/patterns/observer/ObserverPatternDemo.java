package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 15
 **/
public class ObserverPatternDemo {
    public static void main(String[] args) {

        Feed feed = new Feed();

        feed.registerObserver(new NYTimes());
        feed.registerObserver(new Espn());
        feed.registerObserver(new LaMonde());


        feed.notifyObservers("Federer won the tennis match in Rome and got $5 million money in cash. ");
    }
}
