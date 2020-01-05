package chap5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Created by Antony Genil Gregory on 10/26/2019 7:12 PM
 * For project : JavaProfessionalCert
 **/
public class DateTimeDemo {
    public static void main(String[] args) {
        // Period
        Period period = Period.ofYears(1);
        period = Period.ofDays(23);

        // Duration
        LocalDate localDate = LocalDate.now();
        Duration duration = Duration.of(10, ChronoUnit.DAYS);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plus(duration));

        // Use Chrono Unit for differences

        LocalDate localDate1 = localDate.plus(32, ChronoUnit.DAYS);
        System.out.println(localDate +" && " + localDate1);

        System.out.println();

        System.out.println(ChronoUnit.MONTHS.between(localDate, localDate1));

        System.out.println("Default locale "+ Locale.getDefault());

        LocalTime t1 = LocalTime.of(10,10);
        LocalTime t2 = LocalTime.of(20,1);

        long due = Duration.between(t2, t1).toHours();

        System.out.println("Duration "+due);

    }
}
