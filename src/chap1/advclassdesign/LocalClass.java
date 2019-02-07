package chap1.advclassdesign;

/**
 * Created by genil on 1/16/19 at 08 36
 **/
public class LocalClass {
    private int len = 30;
    public void doCalc() {
        int width = 20;
//        width = 340; enabling it will make the class fail to compile. It is not effectively final
        class Multiply {
            public int getArea() {
                return len * width;
            }
        }

        Multiply multiply = new Multiply();
        int area = multiply.getArea();


        System.out.println("area =  "+area);
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.doCalc();
    }
}
