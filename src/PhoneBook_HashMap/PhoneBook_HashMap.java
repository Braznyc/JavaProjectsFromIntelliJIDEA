package PhoneBook_HashMap;

// The "import" keyword is used to import classes or packages do Java
import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook_HashMap{

        // Method to validate if the name contains only letters, spaces, hyphens, or apostrophes
        private static boolean isNameValid(String name) {
            if (name.matches("^[a-zA-Z' -]+$") == true) { //This regex have all letters and spaces used to write a name
                return true;
            }
            System.out.println("Invalid name!");
            return false;

        }

        // Method to validate if the phone number matches a specific format. The regex below inclued what can be used to write a phone number, which excludes letters and other characters.
        private static boolean isPhoneNumberValid(String phoneNumber) {
            if (phoneNumber.matches("\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}") == true) {
                return true;
            }
            System.out.println("Invalid phone number!");
            return false;
        }

        public static void main(String s[]) {

            // Create a Scanner object to read user input
            Scanner userInput = new Scanner(System.in);
            // Create a HashMap to store names (keys) and phone numbers (values)
            HashMap<String, String> phonebook = new HashMap<>();

            try {
                // Infinite loop to keep the program running until the user chooses to exit
                while (true) {
                    // Display the menu options to the user
                    System.out.println(
                            "Press 1 to add an entry in the phonebook," +
                                    "\n2 to view all the entries" +
                                    "\n3 to search for entries with name" +
                                    "\n4 to delete an entry" +
                                    "\nAny other key to exit");

                    // Read the user's choice. Notice that userAction is a String and the numbers entered will be considered strings (the options 1, 2, 3, 4)
                    String userAction = userInput.nextLine();

                    // Option 1: Add a name-number entry to the phonebook
                    if (userAction.equals("1")) {
                        // Prompt the user to enter the name
                        System.out.println("Enter a name");
                        String name = userInput.nextLine();
                        // Validate the name format
                        if (!isNameValid(name)) {
                            continue; // Skip to the next iteration if the name is invalid (going back to the begining of the when loop). If not go the next step to check if the name already exists)
                        }
                        // Check if the name already exists in the phonebook
                        if (phonebook.containsKey(name)) {
                            System.out.println("This name already exists! Do you want to replace the number? y/n");
                            String repChoice = userInput.nextLine();
                            // If the user chooses not to replace, skip to the next iteration
                            // The "repChoice.equalsIgnoreCase()" method is used to compare 2 string ignoring the case (like "rick" and "Rick")
                            if (repChoice.equalsIgnoreCase("n")) {
                                continue; // Again goes back to the begining of the When loop.
                            }
                        }

                        // Prompt the user to enter the phone number
                        System.out.println("Enter the phone number");
                        String phoneNumber = userInput.nextLine();
                        // Validate the phone number format
                        if (!isPhoneNumberValid(phoneNumber)) {
                            continue; // Skip to the next iteration if the phone number is invalid
                        }
                        // Add the name and phone number to the HashMap using the "put()" method
                        phonebook.put(name, phoneNumber);
                        System.out.println("The name and number have been added to the phonebook.");
                    }
                    // Option 2: View all the entries in the phonebook
                    else if (userAction.equals("2")) {
                        // Iterate through the HashMap and print all key-value pairs
                        // the "keySet()" method iterates the HashMap
                        for (String name : phonebook.keySet()) {
                            System.out.println(name + ": " + phonebook.get(name)); // The "get()" method retrieves the key/value stored in the HashMap
                        }
                    }
                    // Option 3: Search for an entry by name
                    else if (userAction.equals("3")) {
                        // Prompt the user to enter the name to search
                        System.out.println("Enter the name you want to search");
                        String keyName = userInput.nextLine();
                        // Check if the name exists in the phonebook
                        if (phonebook.containsKey(keyName)) {
                            // Display the phone number associated with the name
                            System.out.println("The phone number you are looking for is " +
                                    phonebook.get(keyName));
                        } else {
                            System.out.println("No such name found in the phonebook.");
                        }
                    }
                    // Option 4: Delete an entry by name
                    else if (userAction.equals("4")) {
                        // Prompt the user to enter the name to delete
                        System.out.println("Enter the name you want to delete ");
                        String keyName = userInput.nextLine();
                        // Check if the name exists in the phonebook
                        if (phonebook.containsKey(keyName)) {
                            // Remove the entry from the HashMap
                            phonebook.remove(keyName);
                            System.out.println("The entry has been removed.");
                        } else {
                            System.out.println("No such name found in the phonebook.");
                        }
                    }
                    // Exit the program if the user enters any other key
                    else {
                        break; // This "break" will force the exit of the loop, that so far has been an infinit loop (while (true))
                    }
                }
                // The exeption "NumberFormatExeption nfe" is used when trying to convert strings to numbers (integers, doubles, floats etc)
            } catch (NumberFormatException nfe) {
                // Handle invalid number input (for example, non-integer input for priority or index)
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

