package File_And_Directory_Handling;

import java.io.File;
import java.io.IOException;

public class Creating_Directory_Using_IO {
    public static void main(String[] args) {
        // Define the directory path
        String directoryPath = "Projects/Java";

        // Create the directory
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            //Use mkdirs() to create nested directories
            boolean created = directory.mkdirs();

            if (created) {
                System.out.println("Directory created successfully! " + directoryPath);

            } else {
                System.out.println("Directory already exists: " + directoryPath);
            }
        }


    }
}
