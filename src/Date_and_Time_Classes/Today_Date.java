package Date_and_Time_Classes;

import java.time.LocalDate;

public class Today_Date {

    public static void main(String[] args) {

        // A Class (LocalDate) is instantiated (object) and the now() method is called to show the current date (day)
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

    }


}