package patterns.factory;

/**
 * Created by genil on 6/24/18 at 06 20
 **/

@FunctionalInterface
public interface Shape {
    public void draw();
    default void log() { // Default override is optional ...
        System.out.println("default log method from interface");
    }
    default void oneMore() { // can have more than one default, override is optional in concrete subclass
        System.out.println("One more default method in interface.... .. .");
    }
    static void log2() { // static This cannot be overriden !!
        System.out.println("Logging to DB from interface!");
    }

    static  void log3() { // can have more than one static and static cannot be overriden...
        System.out.println("Logging to file from interface");
    }

}
