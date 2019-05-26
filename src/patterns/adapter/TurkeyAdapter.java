package patterns.adapter;

/**
 * Created by genil on 6/24/18 at 10 45
 * Adapter lets classes works together that couldn't be otherwise possible because of incompatible interfaces !
 *
 *
 **/
public class TurkeyAdapter implements Duck {
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //Turkey cannot fly long as duck, so boost it up. Adapter helps here

        for (int i = 0; i <5 ; i++) {
            turkey.fly();
        }

    }
}
