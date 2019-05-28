package streams;

/**
 * Created by anton on 6/9/2018 10:19 AM
 **/
public class Menu {
    private final String name;
    private final int calories;
    private final float price;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public float getPrice() {
        return price;
    }

    public Menu(String name, int calories, float price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }
}
