package jvm;

/**
 * Created by anton on 6/23/2018 8:31 AM
 **/

class Super {
    Super() {
        System.out.println("Super class constructor");
    }
    static {
        System.out.println("Super class static");
    }
}

class Sub extends Super {
    static final int FINAL1 = 47;
    static final int FINAL2  = (int)(Math.random()*5);
    static {
        System.out.println("Sub class static initializer");
    }
    Sub() {
        System.out.println("Sub class constructor called");
    }
}

public class ClassInitializerDemo {
    static {
        System.out.println("Demo class static initializer");

    }
    {
        System.out.println("demo class instance initializeer ...");
    }

    public ClassInitializerDemo() {
        System.out.println("Demo class constructor called");
    }

    public static void main(String[] args) {
        new ClassInitializerDemo();
        System.out.println(Sub.FINAL2);
        System.out.println(Sub.FINAL1);



        new Sub();
    }
}
