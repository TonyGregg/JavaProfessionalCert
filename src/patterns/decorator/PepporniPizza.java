package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 20 52
 **/
public class PepporniPizza extends Pizza {
    public PepporniPizza() {
        description = "Pepperoni pizza";
    }

    @Override
    public float getCost() {
        return  8.5f;
    }
}
