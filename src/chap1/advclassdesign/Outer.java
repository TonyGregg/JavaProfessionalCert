package chap1.advclassdesign;

/**
 * Created by genil on 2/11/19 at 18 03
 **/
public class Outer {
    public class Inner {

    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner();


    }
}
