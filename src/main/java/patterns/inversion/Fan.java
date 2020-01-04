package patterns.inversion;

/**
 * Created by anton on 6/2/2018 7:33 AM
 **/
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan running.. ");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan stop requested.. ");

    }
}
