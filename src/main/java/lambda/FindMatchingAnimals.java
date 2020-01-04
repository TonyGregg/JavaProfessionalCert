package lambda;

/**
 * Created by genil on 6/13/18 at 06 45
 **/
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTest checkTest) {
        if(checkTest.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal("fish",false,true);

        CheckTest checkTest = (Animal animal1)-> {
            //Override of test method happens here
            return animal.canHop();
        };

        print(new Animal("fish",false,true),checkTest);
        //More simplified version
        print(new Animal("fish",false,true),(a -> a.canHop()));

        // even more simpler
        print(new Animal("fish",false,true),Animal::canHop);
    }
}
