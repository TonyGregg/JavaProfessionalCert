package chap2;

/**
 * Created by genil on 2/20/19 at 18 42
 **/
interface Climb {
    boolean isTooHigh(int height, int limit);
}
public class Climber {
    public static void main(String[] args) {

//           check((h, l) -> h.toString(), 5); // x1 // error

        /*check(((height, limit) -> { // error as well
            return false;
        }));*/

    }
    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) //x2
            System.out.println("too high");
        else System.out.println("ok");
    }
}
