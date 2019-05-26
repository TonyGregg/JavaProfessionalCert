package patterns.builder;

/**
 * Created by genil on 2019-05-16 at 20 52
 **/
public class BuilderDemo {
    public static void main(String[] args) {


        User user = new User.Builder("antonygenil@gmail.com","male").age(38).build();

        System.out.println(user);

        user = new User.Builder("antonygenil@gmail.com","male").age(38).visaStatus("H1-B").build();

        System.out.println(user);


        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10,20).fat(5).sodium(3).build();

        System.out.println(nutritionFacts);

    }
}
