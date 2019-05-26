package patterns.observer;

/**
 * Created by Antony Genil Gregory on 5/5/2019 12:04 PM
 * For project : JavaProfessionalCert
 **/
public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers(String tweet);
}
