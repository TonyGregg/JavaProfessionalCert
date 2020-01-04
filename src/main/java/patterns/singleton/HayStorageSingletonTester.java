package patterns.singleton;

/**
 * Created by genil on 6/13/18 at 10 09
 **/
public class HayStorageSingletonTester{
    public static void main(String[] args) throws CloneNotSupportedException {

//        HayStorage hayStorage = new HayStorage(); // will not compile

        HayStorage hayStorage = HayStorage.getInstance();
        System.out.println(hayStorage.getQuantity());
        System.out.println(hayStorage.getQuantity());

        HayStorage hayStorage1 = HayStorage.getInstance();

        System.out.println(hayStorage.equals(hayStorage1));// true

        HayStorage hayStorage2 = (HayStorage) hayStorage.clone(); // run time error. clone not supported

        System.out.println(hayStorage.equals(hayStorage2)); // this line will not execute because of the previous line error


    }


}
