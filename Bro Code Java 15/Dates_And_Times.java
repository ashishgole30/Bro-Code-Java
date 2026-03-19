import java.time.LocalDate;
import java.time.LocalTime;

public class Dates_And_Times {
    public static void main(String[] args) {

        // How to work with Dates & Times using java
        // (Localdate , localtime, localdatetime, UTC timestamp)

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}