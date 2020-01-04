package chap1.advclassdesign;

/**
 * Created by genil on 2/9/19 at 12 49
 **/
public class LocalInnerDemo {
    private int length = 20;
    public void calc() {
        final int width = 20;
        int i;
        i = 20;
        int j;
        j = 23;




         class LocalInner {
            public void multiply() {
                System.out.println(length * width + i - j );
            }
        }

        LocalInner inner = new LocalInner();
        inner.multiply();

    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        LocalInnerDemo localInnerDemo = new LocalInnerDemo();
        localInnerDemo.calc();
    }
}
