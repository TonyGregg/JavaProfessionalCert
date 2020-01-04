package chap1.advclassdesign;

/**
 * Created by genil on 2/11/19 at 18 34
 **/
public class Swimmer {
    enum AnimalClasses {
        MAMMAL, FISH {
            public boolean hasFins() {
                return true;
            }
        },
        BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;
//        public abstract boolean hasFins(); // compile time error AnimalClasses is abstract cannot be instantiated

        public  boolean hasFins() { // this works fine
            return true;
        };
    }

    public static void main(String[] args) {
        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
        System.out.println(AnimalClasses.FISH.hasFins());
        System.out.println(AnimalClasses.BIRD.hasFins());
    }
}
