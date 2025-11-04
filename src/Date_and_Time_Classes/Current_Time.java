package Date_and_Time_Classes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time {
    public static void main(String[] args) {

        // Notice below that the keyword "new" is not used to create the object (now) because its value is immutable, the date and time are what they are, and they do not change
        // Conclusion: the "new" keyword is not used with time classes like LocalTime, LocalDate and LocalDateTime.

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current time: " + now.format(formatter));
    }
}
