package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 20 48
 **/
public class CheesePizza extends Pizza{

    public CheesePizza() {
        description = "Cheese pizza";
    }

    @Override
    public float getCost() {
        return 7.5f;
    }


}
