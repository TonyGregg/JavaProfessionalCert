package chap2;

/**
 * Created by genil on 2/16/19 at 12 34
 **/
public class ClassCastDemo {
    public static void main(String[] args) {

        Parent parent = new Parent();

        Child child = new Child();


//        child = (Child) parent; // it is going to give runtime exception
        //better try this


        if (parent instanceof Child) {
            child = (Child) parent;
        }


    }
}

class Parent {

    protected void doEat() {
        System.out.println("Eating chorru");
    };

}

class Child extends Parent {

    @Override
    public void doEat() {
        System.out.println("Eating Biryani");
    }
}


