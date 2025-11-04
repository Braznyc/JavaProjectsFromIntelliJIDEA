package Date_and_Time_Classes;

// Import the LocalDate class from the java.time package to work with dates
import java.time.LocalDate;
// Import the LocalTime class from the java.time package to work with times
import java.time.LocalTime;

public class DateTimePrinter {

    public static void main(String[] args) {
        // Print the current date to the console
        // LocalDate.now() retrieves the current date from the system clock
        System.out.println("The date is " + LocalDate.now());

        // Print the current time to the console
        // LocalTime.now() retrieves the current time from the system clock
        System.out.println("The time is " + LocalTime.now());

        // All the above was created without object. The following examples will use them. The output wil be the same:

        System.out.println(" ");

        LocalDate today = LocalDate.now();
        LocalTime timeNow = LocalTime.now();

        System.out.println("The date is: " + today);
        System.out.println("The time is: " + timeNow);






    }
}