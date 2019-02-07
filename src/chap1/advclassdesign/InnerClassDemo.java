package chap1.advclassdesign;


/**
 * Created by genil on 1/16/19 at 08 08
 **/
public class InnerClassDemo {
    private int x = 10;
    class A {

        private int x = 20;

        class B {
            private int x = 30;

            public void printX() {
                System.out.println("X = "+x);
                System.out.println("this.x = "+this.x);
                System.out.println("A.this.x "+A.this.x);
                System.out.println("Innter.this.x "+InnerClassDemo.this.x);
            }
        }

    }

    public static void main(String[] args) {
        InnerClassDemo demo = new InnerClassDemo();
        A a = demo.new A();
        A.B b = a.new B();
        b.printX();
    }
}
