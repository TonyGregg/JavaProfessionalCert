package patterns.observer.revisit;

/**
 * Created by Antony Genil Gregory on 1/22/2020 3:01 AM
 * For project : JavaProfessionalCert
 **/
public interface Subject {
    public boolean addObserver(Observer observer);
    public void notifyObservers(String tweet);

}
