package chap4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Antony Genil on 2019-05-31 at 08 26 for JavaProfessionalCert
 **/
public class TradeHandler {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 17500),
                new Transaction(alan, 2012, 950)
        );

        /**
         * Exercises:
         *
         * 1. Find all transactions in the year 2011 and sort them by value (small to high).
         * 2. What are all the unique cities where the traders work?
         * 3. Find all traders from Cambridge and sort them by name.
         * 4. Return a string of all traders’ names sorted alphabetically.
         * 5. Are any traders based in Milan?
         * 6. Print all transactions’ values from the traders living in Cambridge.
         * 7. What’s the highest value of all the transactions?
         * 8. Find the transaction with the smallest value.
         */

        // 1. Find all the transactions in 2011 and sort by value small to high
        List<Transaction> trxs2011 = transactions
                .stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());

        System.out.println(trxs2011);

        // 2. Unique cities where trader work

        List<String> uniqueCitiesTraders = transactions.stream()
//                .map(Transaction::getTrader)
//                .map(Trader::getCity)
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique cities : "+uniqueCitiesTraders);

        // 3. Find all the traders from cambridge and sort by their name !

        List<Trader> cambridgeTraders = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList())
                ;

        System.out.println("Cambridge traders "+ cambridgeTraders);


        // 4. List traders name alphabetically

        List<String> traderNames = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.toList())
                ;
        System.out.println("Trader names in sorted order "+traderNames);

        // 5. Are there any traders in Milan ?

       boolean isAnyMilanTrader = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equalsIgnoreCase("Milan"));

        System.out.println("Is Any milan based trader ? : "+isAnyMilanTrader);

        // 6.Print all transactions’ values from the traders living in Cambridge.

        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        // 7. What’s the highest value of all the transactions?

        Optional<Integer> highestTrx = transactions
                .stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                ;

        System.out.println("Highest trx : "+highestTrx.get());

        // 8. Find the transaction with smallest value

        Optional<Transaction> smallestTrx = transactions
                .stream()
                .reduce((transaction, transaction2)
                        -> transaction.getValue() < transaction2.getValue()? transaction : transaction2)
                ;

        // you can do better using compar

        Optional<Transaction> smallTrx1 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println("Smallest trx : "+smallestTrx.get() + " ... .. "+smallTrx1.get());





    }
}
