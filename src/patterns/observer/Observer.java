package patterns.observer;

/**
 * Created by Antony Genil Gregory on 5/5/2019 11:59 AM
 * For project : JavaProfessionalCert
 **/
@FunctionalInterface
public interface Observer {
    public void notify(String tweet);
}
