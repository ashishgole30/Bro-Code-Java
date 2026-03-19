import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates_And_Times {
    public static void main(String[] args) {

        // How to work with Dates & Times using java
        // (Localdate , localtime, localdatetime, UTC timestamp)

        LocalDate dateone = LocalDate.now();
        System.out.println(dateone);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant); // UTC Time

        // Custom Format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom date time object
        LocalDate datetwo = LocalDate.of(2024, 12, 25);
        System.out.println(datetwo);

        LocalDateTime datethree = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(datethree);

        // Comparing dates
        LocalDateTime datefour = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime datefive = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        if (datefour.isBefore(datefive)) {
            System.out.println(datefour + " is earlier than " + datefive);
        } else if (datefour.isAfter(datefive)) {
            System.out.println(datefour + " is later than " + datefive);
        } else if (datefour.isEqual(datefive)) {
            System.out.println(datefour + " is equal to " + datefive);
        }
    }
}