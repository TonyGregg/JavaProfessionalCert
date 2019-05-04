package trials;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toSet;

/**
 * Created by Antony Genil Gregory on 5/4/2019 12:17 PM
 * For project : JavaProfessionalCert
 **/
public class TraderTransactionExcercise {

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
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Q1) Find all transactions in 2011 and sort by value (small to high)

        List<Transaction> trx2011 = transactions.stream().
                filter(transaction -> transaction.getYear() == 2011).
                sorted(comparing(Transaction::getValue)).
                collect(toList());

        System.out.println(trx2011);

        // Q2) Unique cities where the traders work?

        Set<String> uniqueCities = transactions.stream().map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());

        System.out.println(uniqueCities);

        // Q3) Find all the traders from Cambridge and sort them by name

        List<Trader> cambridgeTraders = transactions.stream().map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName)).collect(toList());

        System.out.println(cambridgeTraders);




    }
}
