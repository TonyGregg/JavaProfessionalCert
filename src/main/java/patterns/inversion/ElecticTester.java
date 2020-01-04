package patterns.inversion;

/**
 * Created by anton on 6/2/2018 7:34 AM
 **/

public class ElecticTester {
    public static void main(String[] args) {

        class TEst{
            int i = 23;
        }
        Switchable bulb = new LightBulb();
        Switch bulbSwitch = new ElectricSwitch(bulb);

        bulbSwitch.press();
        bulbSwitch.press();

        Switchable fan= new Fan();
        Switch fanSwitch= new ElectricSwitch(fan);

        fanSwitch.press();
        fanSwitch.press();
        fanSwitch.press();
    }
}
