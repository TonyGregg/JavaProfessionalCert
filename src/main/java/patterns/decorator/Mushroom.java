package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 21 02
 **/
public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        this.pizza = pizza;
    }

    Pizza pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription()+ " , Mushroom";
    }

    @Override
    public float getCost() {
        return 0.5f + pizza.getCost();
    }
}
