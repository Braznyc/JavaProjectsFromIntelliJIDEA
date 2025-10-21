package File_And_Directory_Handling;

import java.io.FileInputStream;
import java.io.IOException;


public class Read_File_InputStream {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {
            // Create a FileInputStream to read from a file

            fileInputStream = new FileInputStream("output.txt");

            // Variable to hold the byte data

            int byteData;

            // Read bytes until end of file

            while ((byteData = fileInputStream.read()) != -1) {

                // Print the byte data as characters
                System.out.println((char) byteData);
            }
                } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Close the stream to free resources
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            }


        }
    }

