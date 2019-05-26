package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 21 00
 **/
public class  Pepper extends PizzaDecorator {

    public Pepper(Pizza pizza) {
        this.pizza = pizza;
    }

    Pizza pizza;

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Pepper";
    }

    @Override
    public float getCost() {
        return 0.2f + pizza.getCost();
    }
}
