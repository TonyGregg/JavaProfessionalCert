package collections;

public class Apple {
    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    String color;

    public String getColor() {
        return color;
    }


    public Integer getWeight() {
        return weight;
    }



    public static boolean isGreenApple(Apple apple) {
        return "green".equalsIgnoreCase(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight()>20;
    }



    @Override public String toString(){
        return this.getColor()+" : "+this.getWeight();
    }

    int weight;
}