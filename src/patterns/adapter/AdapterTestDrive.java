package patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 53
 *
 * Adapter lets classes work together that couldn't be possible otherwise because of incompatible interfaces
 *
 **/
public class AdapterTestDrive {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck duckAdaptor = new TurkeyAdapter(wildTurkey); // Turkey adapter accepts turkey and is assigned to Duck interface


        mallardDuck.quack();
        mallardDuck.fly();

        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println(" ----  see the adapter in acion next ---");

        duckAdaptor.quack(); // It calls instead the vendor turkey's method gobble
        duckAdaptor.fly();


    }
}
