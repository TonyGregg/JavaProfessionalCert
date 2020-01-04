package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 21 04
 **/
public  class Jalepeno extends PizzaDecorator {
    public Jalepeno(Pizza pizza) {
        this.pizza = pizza;
    }

    Pizza pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Jalepeno hot";
    }

    @Override
    public float getCost() {
        return pizza.getCost() + 0.75f;
    }
}
