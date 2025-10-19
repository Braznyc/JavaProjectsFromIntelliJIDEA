package File_Handling;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Read_And_Write_FileInputStream_FileOutputStream {

    public static void main(String[] args) {

        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

            // Create FileInputStream to read from "output.tx"

            inputFile = new FileInputStream("output.txt");

            // Create FileInputStream to write to "destination.txt"

            outputFile = new FileOutputStream("destination.txt");

            int byteData;

            // Read bytes from source and writes them to destination

            while ((byteData = inputFile.read()) != -1) {
                outputFile.write(byteData);


            }
            System.out.println("File copied successfuly!");

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
