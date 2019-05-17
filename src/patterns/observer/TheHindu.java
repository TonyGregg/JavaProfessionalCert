package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 6/24/18 at 18 45
 **/
public class TheHindu implements Subject {
    List<Observer> observers = new ArrayList<>();

    private static final String news = "Today is news in time is all about India politics and Economhy";



    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer->{
            observer. notify(news);
        });
    }
}
