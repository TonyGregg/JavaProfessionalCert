package patterns.observer;

/**
 * Created by genil on 2019-05-17 at 17 07
 **/
@FunctionalInterface
public interface Observer {
    public void notify(String tweet);
}
