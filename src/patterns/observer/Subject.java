package patterns.observer;

/**
 * Created by anton on 6/9/2018 3:37 PM
 *
 * Subject is nothing but the Publisher - NY Times, The Hindu, Times of India and BBC
 *
 *  * Publisher is the subject - New york Times, BBC, Times of India and The Hindu
 *  * Subscribers are the Observers - Greg Family, St. James School, Church
 *

 * Register new observers
 * notify all observers
 *
 * Remove subscriber, etcs. .
 **/
public interface Subject {

    void registerObserver(Observer observer);
    void notifyObservers();

}
