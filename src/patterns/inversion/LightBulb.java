package patterns.inversion;

/**
 * Created by anton on 6/2/2018 7:32 AM
 **/
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Lights turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights turn off");

    }
}
