package patterns.observer;

/**
 *
 * Publisher + Subscriber = observer Pattern
 *  *  * Publisher is the subject - New york Times, BBC, Times of India and The Hindu
 *  *  * Subscribers are the Observers - Greg Family, St. James School, Church
 *
 * Created by anton on 6/9/2018 3:37 PM
 *
 **/
public class Distributor  {

    public static void main(String[] args) {

        /**
         * Antony wants to read global as well as local news
         */
        Observer antony = new ObserverAntony();
        TheChurch church = new TheChurch();

        Times times = new Times();

        times.registerObserver(antony);


        TheHindu hindu = new TheHindu();

        hindu.registerObserver(church);
        hindu.registerObserver(antony);

        times.notifyObservers();
        hindu.notifyObservers();


    }
}
