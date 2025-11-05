package Date_and_Time_Classes;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Parsing string into date: making the computer understand that the text is a date (day, month or year).
public class Parsing_Strings_Into_Date_Part1 {

    public static void main(String[] args){

        // Define a date string to parse
        String dateString = "2025-01-23";

        // Create a DateTimeFormatter to define the expected format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the string into a LocalDate object

        LocalDate date = LocalDate.parse(dateString, formatter);

        // Output the date
        System.out.println("Parsed date: " + date);





    }


}
