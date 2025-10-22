package Date_and_Time_Classes;

import java.time.ZonedDateTime;

public class Date_TimeZone {
    public static void main(String[] args ) {
        ZonedDateTime zonedNow = ZonedDateTime.now();


        System.out.println("Current date and time with zone: " + zonedNow);
    }
}
