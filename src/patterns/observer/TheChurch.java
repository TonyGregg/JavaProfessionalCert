package patterns.observer;

/**
 * Created by genil on 6/23/18 at 18 29
 **/
public class TheChurch implements Observer {
    @Override
    public void notify(String news) {
        System.out.println("Church received :: "+news);
    }
}
