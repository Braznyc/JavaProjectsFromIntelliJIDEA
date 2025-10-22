package Date_and_Time_Classes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current time: " + now.format(formatter));
    }
}
