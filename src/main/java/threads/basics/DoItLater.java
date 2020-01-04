package threads.basics;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by genil on 6/11/18 at 02 45
 **/
public class DoItLater {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = null;
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.scheduleAtFixedRate(()-> {
            System.out.println("Time now at " + new Date());
        },0,1, TimeUnit.SECONDS);
    }
}
