package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 2019-05-17 at 17 13
 **/
public class Feed implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(observer -> observer.notify(tweet));
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }
}
