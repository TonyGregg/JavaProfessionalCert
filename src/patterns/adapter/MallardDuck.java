package patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 42
 **/
public class MallardDuck implements  Duck {
    @Override
    public void quack() {
        System.out.println("Mallard quack. . quack..");
    }

    @Override
    public void fly() {
        System.out.println("Mallard duck flying distance. .. ");

    }
}
