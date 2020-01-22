package patterns.observer.revisit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antony Genil Gregory on 1/22/2020 3:06 AM
 * For project : JavaProfessionalCert
 **/
public class Feed implements Subject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.stream().forEach(observer -> observer.tweet(tweet));
    }
}
