package chap1.advclassdesign;

/**
 * Created by Antony Genil on 2019-09-21 at 15 52 for JavaProfessionalCert
 **/
public class OverLoadOverRideDemo {
}
class A {
    public static void foo() {
        System.out.println("Foo A");
    }

}

class B extends  A {
    public static void foo() {

    }
}
