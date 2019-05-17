package patterns.decorator;

/**
 * Created by genil on 6/23/18 at 20 43
 **/
public abstract class Pizza {
     String description = "Unknown pizza";

    public String  getDescription() {
        return this.description;
    }
    public abstract float getCost();

}
