package File_And_Directory_Handling;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Read_And_Write_FileInputStream_FileOutputStream {

    public static void main(String[] args) {

        FileInputStream inputFile = null;  // These 2 lines of code
        FileOutputStream outputFile = null;// are creating 2 variables from the 2 classes (FileInputStream and FileOutputStream). Those 2 variable will behave like the classes.

        try {

            // Create FileInputStream to read from "output.tx"

            inputFile = new FileInputStream("source.txt");

            // Create FileInputStream to write to "destination.txt"

            outputFile = new FileOutputStream("destination.txt");

            // Below a variable byteData is created to store the value the code gets from the file "source.txt". That value will be later stored to the "destination.txt" file

            int byteData;

            // Read bytes from source and writes them to destination

            while ((byteData = inputFile.read()) != -1) {
                outputFile.write(byteData);


            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close both streams

            try {
                // Ensure we don't try to close streams that were never successfully opened
                // (in case the file opening failed earlier)
                if (inputFile != null) inputFile.close();
                if (outputFile != null) outputFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }
}
