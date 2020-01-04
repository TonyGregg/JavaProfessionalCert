package chap2.dp;

/**
 * Created by genil on 2/18/19 at 11 17
 **/
public class MrSingle {
    private MrSingle() {

    }

    /**
     * volatile ensures on multithreaded environment, each threads maintains its own copy.
     */
    private static volatile MrSingle mrSingleInstance;

    public static MrSingle getMrSingleInstance() {
        if (mrSingleInstance == null) {
            synchronized (MrSingle.class) {
                if (mrSingleInstance == null) {
                    mrSingleInstance = new MrSingle();
                }
            }

        }

        return mrSingleInstance;


    }

    public void getWhatIDo() {
        String[] patterns = {"Reading a booking ", " Designing an application ", " Playing Tennis "," Swimming on " +
                " the ocean"," Fishing is fun", "Warm beach is the best"," Eating yummy"};

        int random = (int)(Math.random()*7);
        System.out.println(patterns[random]);

    }


}
