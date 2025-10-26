package Date_and_Time_Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Date_Formatting {
    public static void main(String[] args) {

        // Get the current date

        LocalDate currentDate = LocalDate.now();

        // Define format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // Format the date

        String formattedDate = currentDate.format(formatter);

        System.out.println("Formated date: " + formattedDate);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        formattedDate = currentDate.format(formatter1);

        System.out.println("Formated date: " + formattedDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy");

        formattedDate = currentDate.format(formatter2);

        System.out.println("Formated date: " + formattedDate);





    }
}
