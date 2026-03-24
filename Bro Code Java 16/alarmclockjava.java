import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class alarmclockjava {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK PROJECT

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "audio.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.print("Alarm set for " + alarmTime);
                System.out.println();
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Format. Please use HH:MM:SS");
            }
        }

        AlarmClockClass alarmClock = new AlarmClockClass(alarmTime, filepath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}