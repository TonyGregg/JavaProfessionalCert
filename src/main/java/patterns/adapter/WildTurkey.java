package patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 44
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Turkey gobbling...");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey flies short distance");

    }
}
