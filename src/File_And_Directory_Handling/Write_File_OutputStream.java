package File_And_Directory_Handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_File_OutputStream {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {

            // Create a FileOutputStream to write to a file

            fileOutputStream = new FileOutputStream("output.txt");

            // Data to write
            String data = "Hello, World!";

            // Convert the string to bytes

            byte[] byteData = data.getBytes();

            // Writes bytes to a file

            fileOutputStream.write(byteData);

        } catch (IOException e) {
            e.printStackTrace();


        } finally {

            // Close the stream to free resources
            if (fileOutputStream != null) {

                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

    }

}
