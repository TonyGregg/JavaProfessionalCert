package chap1.advclassdesign;


/**
 * Created by genil on 1/16/19 at 08 08
 **/
public class InnerClassDemo {
    private int x = 10;
     private class A {

          private int x = 20;

          protected void someMetho() {
              System.out.println("Some method...");
          }

        class B {
             private int x = 30;

            public void printX() {
                System.out.println("X = "+x); //30
                System.out.println("this.x = "+this.x); // 30
                System.out.println("A.this.x "+A.this.x); // 20
                System.out.println("Innter.this.x "+InnerClassDemo.this.x); // 10
            }

             public class C {
                int x = 40;
                private void printX() {
                    System.out.println("X = "+x); // 40
                    System.out.println("this.x = "+this.x); //40
                    System.out.println("B.this.x "+B.this.x); //30
                    System.out.println("Inner.this.x "+InnerClassDemo.this.x); //10
                }
            }
        }

    }

    public static void main(String[] args) {
        InnerClassDemo demo = new InnerClassDemo();
        A a = demo.new A();

        a.someMetho();
        A.B b = a.new B();
        b.printX();


        A.B.C c = b.new C();
        c.printX();
    }
}
