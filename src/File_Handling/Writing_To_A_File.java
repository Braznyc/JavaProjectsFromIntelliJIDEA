package File_Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_To_A_File {

    public static void main(String[] args){


        try {
            FileWriter writer = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer); // Here the object "writer" will be wrapped with the BufferedWriter
            bufferedWriter.write("Hello, World!"); // Notice that here the method write() is used to write to a file. Do not confuse it with the object writer that was created above
            bufferedWriter.newLine(); // Adds a new line
            bufferedWriter.write("This is a Java file handling example!");
            bufferedWriter.close();
            System.out.println("Data written to file successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println(" ");

        // Reminder: The same code can be written without the BufferedWriter. The BuffereWriter is used to optimize
        // the use of memory. As the following example shows the use of the FileWriter without the buffering:

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!\n");
            writer.write("This is a Java file handling example.");
            writer.close(); // Important to close the writer to ensure data is written
            System.out.println("Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}
