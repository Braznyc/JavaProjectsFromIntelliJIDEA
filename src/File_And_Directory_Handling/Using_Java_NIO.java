package File_And_Directory_Handling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Using_Java_NIO {

    public static void main(String[] args) {
        // A path object is created from the Path class
        // The Paths.get is used to create the directory path
        Path path = Paths.get("Projects/NioExample");
            try{
                // Create the directory using NIO. To do that a method called createDirectories() is used
                Path createDir = Files.createDirectories(path);
                System.out.println("Directory created successfully: " + createDir.toString());
            } catch (IOException e) {
                System.out.println("Failed to create directory: " + e.getMessage());
              // Notice above that System.out.println() and System.err.println() are used. System.err.println() will print the error message in red
        }


    }
}
