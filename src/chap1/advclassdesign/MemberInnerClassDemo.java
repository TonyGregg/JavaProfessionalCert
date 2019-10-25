package chap1.advclassdesign;

/**
 * Created by Antony Genil on 2019-10-01 at 08 17 for JavaProfessionalCert
 **/
public class MemberInnerClassDemo {
    private String hi = "Hey";
    private class Inner {
        private void sayHi() {
            for (int i = 0; i < 3; i++) {
                System.out.println(hi);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.sayHi();
    }

    public static void main(String[] args) {
        MemberInnerClassDemo outer = new MemberInnerClassDemo();
        outer.callInner();

        System.out.println("----");
        // another way of calling inner
        Inner inner = outer.new Inner();
        inner.sayHi();
    }
}
