package patterns.observer;

/**
 * Created by genil on 6/23/18 at 18 28
 **/
public class ObserverAntony  implements Observer{
    @Override
    public void notify(String news) {
        System.out.println("Antony received news about "+news);
    }
}
