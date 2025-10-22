package Date_and_Time_Classes;


import java.time.LocalDateTime;


public class Current_Date_Time {
    public static void main(String[] args) {

        // The now is an object created by the LocalDateTime class. The now() function is used to show the current time
        LocalDateTime now = LocalDateTime.now();

        // The following object (formatter) will use the class DateTimeFormatter to show the seconds in 2 digits
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current date and time: " + now);

    }

}
