package threads.basics;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by anton on 7/24/2018 2:09 PM
 **/
public class MatchQuizConductor {
    private final static int MAX = 100;
    private final static int MIN = 20;
    public static void main(String[] args) {

        int x, y;
        x = getRandmomInteger();
        y = getRandmomInteger();

        System.out.println("X = "+x+ ", Y = "+y) ;

        int result = x*y;

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);


        executorService.scheduleWithFixedDelay( new UserInputHandler(x,y),1, 1, TimeUnit.SECONDS);

        executorService.shutdown();


    }

    private static int getRandmomInteger() {
        Random random = new Random();
        return random.nextInt((MAX-MIN)+1) + MIN;
    }
}

class UserInputHandler implements Runnable{

    int x;
    int y;

    public UserInputHandler(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {

        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter the result: ");
        Integer userInput = scanner.nextInt();
        System.out.println(" User input "+userInput+ " Actual result "+(x*y));

    }
}