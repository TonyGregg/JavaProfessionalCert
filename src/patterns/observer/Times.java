package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genil on 6/23/18 at 18 19
 **/
public class Times implements Subject {
    List<Observer> observers = new ArrayList<>();

    private static final String news = "Today is news in time is all about President and immigration issues";

    @Override
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
