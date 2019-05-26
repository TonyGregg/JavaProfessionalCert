package patterns.observer;

/**
 * Created by anton on 6/9/2018 3:25 PM
 *
 * Subscribers are the Observers
 *
 *  * Publisher is the subject - New york Times, BBC, Times of India and The Hindu
 *  * Subscribers are the Observers - Greg Family, St. James School, Church
 *
 **/

@FunctionalInterface
public interface Observer {
    public void notify(String news);
}
