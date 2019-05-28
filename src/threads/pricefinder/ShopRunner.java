package threads.pricefinder;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.util.stream.Collectors.toList;

/**
 * Created by anton on 6/10/2018 6:18 AM
 **/
public class ShopRunner {


    List<Shop> shops = Arrays.asList(new Shop("Best Buy"), new Shop("Costco"),
            new Shop("Samsclub"),
            new Shop("Target"));

    public static void main(String[] args) {
        String productName = "Pixel 2 phone";
        ShopRunner shopRunner = new ShopRunner();
        //        shopRunner.getPriceAsyncWay(shop);

        shopRunner.getPrices(productName);


    }

    private List<String> getPricesAsync(String productName) {
        Instant starTime = Instant.now();


        List<String> prices = null;

//        shops.forEach(shop -> {
//            CompletableFuture.supplyAsync(shop.getPrice(productName))
//                    .thenCombine(
//                            CompletableFuture.supplyAsync(
//                                    () -> ExchangeService.getRate(ExchangeService.Money.EUR, ExchangeService.Money.USD)),
//                            (price, rate) -> price*rate
//                            });


        // print the price name from each shop

        prices.forEach(System.out::println);

        Instant endTime = Instant.now();

        System.out.println("Total time taken "+Duration.between(starTime,endTime).toMillis()+ " ms");

        return prices;
    }


    private List<String> getPrices(String productName) {
        Instant starTime = Instant.now();


        List<String> prices = shops
                .stream()
                .map((shop -> String.format("%s price is %.2f",shop.getName(),shop.getPrice(productName))))
                .collect(toList());


        // print the price name from each shop

        prices.forEach(System.out::println);

        Instant endTime = Instant.now();

        System.out.println("Total time taken "+Duration.between(starTime,endTime).toMillis()+ " ms");

        return prices;
    }

    private  void getPriceAsyncWay(String productName) {
        Instant now = Instant.now();
        Shop shop = new Shop("Best Buy");

        Future<Double> futurePrice =  shop.getPriceAsync(productName);

        Instant invocationTime = Instant.now();

        System.out.println("Future invocation Time taken "+Duration.between(now,invocationTime).toMillis());

        // Do something else now.. like take care of next customer while the price is being fetched
        Shop.doSomethingElse();

        // now get the price
        try{
            double price = futurePrice.get();
            System.out.printf("Price of the product is $ %.2f%n", price);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        Instant after = Instant.now();

        System.out.println("Price returned after "+Duration.between(now,after).toMillis());
    }
}
