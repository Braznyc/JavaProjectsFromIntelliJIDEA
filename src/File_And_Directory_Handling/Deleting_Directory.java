package File_And_Directory_Handling;

import java.io.File;

public class Deleting_Directory {

    public static void main(String[] args) {

        // In Java to delete a directory that directory has to be empty

        String directoryPath = "Projects/Java";
        File directory = new File(directoryPath);

        // Checks if the directory exists

        if (directory.exists()) {
            // Delete the directory
            boolean deleted = directory.delete();
            if (deleted) {
                System.out.println("Directory deleted successfully: " + directoryPath);
            } else {
                System.out.println("Directory does not exist: " + directoryPath);

            }
        } else {
            System.out.println("Directory does not exist: " + directoryPath);
        }
    }
}
