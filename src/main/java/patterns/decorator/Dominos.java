package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 21 06
 *
 * Decorator pattern :
 *
 * Attaches additional responsibility to the object dynamically
 *
 *
 *
 **/
public class Dominos {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.getDescription() + " $ "+cheesePizza.getCost());

        Pizza vegComboPizza = new PepporniPizza();
        vegComboPizza = new Pepper(vegComboPizza);
        vegComboPizza = new Jalepeno(vegComboPizza);

        System.exit(2);


        System.out.println(vegComboPizza.getDescription() + " $ "+vegComboPizza.getCost());
//        return 1;

    }
}
