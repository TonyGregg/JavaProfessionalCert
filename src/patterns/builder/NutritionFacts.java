package patterns.builder;

import java.util.ArrayDeque;

/**
 * Created by genil on 6/13/18 at 11 51
 *
 * Builder pattern is used to create instance of very complex object in easiest way.
 **/
public class NutritionFacts {

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.sodium = builder.sodium;
        this.fat = builder.fat;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", sodium=" + sodium +
                ", fat=" + fat +
                '}';
    }

    public static class Builder {

        private final int servingSize;
        private final int servings;

        //optional parameters
        private int fat = 0;
        private int sodium = 0;


        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;

//            new NutritionFacts().servingSize
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }


    private  int servingSize;
    private  int servings;
    private int sodium;
    private int fat;


    public static void main(String ...arg) {
        //Demo

        NutritionFacts cocoCola = new NutritionFacts.Builder(20,10).fat(0).sodium(20).build();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.offer(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);

        System.out.println(stack.poll());
        System.out.println(stack.pop());



    }

}
