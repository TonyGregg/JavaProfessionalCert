package chap2;

/**
 * Created by genil on 2/20/19 at 08 13
 **/
public class MultipleDefaultMethodsDemo implements CanWalk, Run {
    @Override
    public void run() {
        System.out.println(" override run method");
    }

    public static void main(String[] args) {
        MultipleDefaultMethodsDemo defaultMethodsDemo = new MultipleDefaultMethodsDemo();

        defaultMethodsDemo.walk();

        defaultMethodsDemo.testMethods();

    }

    private void testMethods() {
        Run.super.walk();

    }


}

interface CanWalk {
    public default void  walk() {
        System.out.println("walking");
    }
}

interface Run extends CanWalk {
    public default void walk() {
        System.out.println("Walking but running");
    }

    void run();
}

interface Sprint extends CanWalk, Run {
    void sprinting();
}