package File_And_Directory_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading_From_A_File {

    public static void main(String[] args) {

        // This program will read the file that was written previously through the "Writing_To_A_File"

        try {
            FileReader reader = new FileReader("output.txt"); // The file reader will read the "output.txt" file
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line; // This string is created just to have something for the while loop to iterate

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line); //The 2 lines that were saved will be read until it gets no result (null)

            }

            bufferedReader.close(); // The bufferedRead has to be close like the scanner to optimise the use of memory


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
