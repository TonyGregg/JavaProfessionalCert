package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antony Genil Gregory on 5/5/2019 12:05 PM
 * For project : JavaProfessionalCert
 **/
public class Feed implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(o-> o.notify(tweet));
    }
}
