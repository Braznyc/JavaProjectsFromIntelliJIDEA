package Date_and_Time_Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Format_User_Date {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the user's name
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();

        // Get user's birthday
        System.out.println("Enter your birthday (yyyy-MM-dd)");
        String birthDateInput = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        // Define the output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        // Format the birthdate using the defined formatter

        String formattedBirthDate = birthDate.format(formatter);

        // Display the result

        System.out.println("Hello, " + name + "! Your birthday is : " + formattedBirthDate);

        scanner.close();



    }
}
