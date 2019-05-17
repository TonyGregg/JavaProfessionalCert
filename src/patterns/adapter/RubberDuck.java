package patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 43
 **/
public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Rubber duck squeeze..squeeze  .");
    }

    @Override
    public void fly() {
        System.out.println("No flying rubber duck.. it can only swim");

    }

}
