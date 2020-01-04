package threads.pricefinder;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * Created by anton on 6/9/2018 8:35 PM
 **/
public class Shop {
    public static void main(String[] args) {

    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;

    private static Random random = new Random();

    /**
     * Synchronous way - too bad !! 16th centuary life
     * @param product
     * @return
     */
    public double getPrice(String product) {
        //TODO real code goes here
        return calculatePrice(product);
    }

    /**
     * The new modern 21st century way !
     * @param product
     * @return
     */
    /*public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();

        new Thread(()-> {
            try{
                double price = calculatePrice(product);
                futurePrice.complete(price);
            } catch (Exception ex) {
                futurePrice.completeExceptionally(ex);
            }


        }).start();

        return futurePrice;

    }*/

    /**
     * Ultra modern simple approach
     * @param product
     * @return
     */

    public Future<Double> getPriceAsync(String product) {
        return CompletableFuture.supplyAsync(()->calculatePrice(product));

    }

    /**
     * To simulate the real world scenario
     * Just delay for 1 second
     */
    public static void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Randomly generated price. Do not worry..
     * @param product name of the product
     * @return price
     */
    private Double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);

    }

    public static void doSomethingElse() {

        try {
            System.out.println("let me sleep for .5 secs");
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }



}
