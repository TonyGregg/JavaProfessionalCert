package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 11
 **/
public interface Subject {
    public void notifyObservers(String tweet);
    public void registerObserver(Observer observer);
}
