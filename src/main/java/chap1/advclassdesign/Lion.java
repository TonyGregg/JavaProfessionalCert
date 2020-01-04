package chap1.advclassdesign;

import java.util.Objects;

/**
 * Created by genil on 1/12/19 at 21 32
 **/

abstract class Cat{
    String name = "The Cat";
       void clean() {

    }
    Cat() {
        System.out.println("Abstract Cat's default constructor");
    }
}
public class Lion extends Cat{

//     static void clean() {
//
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public boolean equals(Lion o) {
        if(o == null || ! (o instanceof Lion)) return false;
        if (this == o) return true;
        Lion otherLion = (Lion) o;
        return id == otherLion.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.setId(100);

        Lion lion2 = new Lion();
        lion2.setId(100);

        if (lion1.equals(lion2)) {
            System.out.println("Same .. same");
        } else {
            System.out.println("No. ..no");
        }
    }
}
