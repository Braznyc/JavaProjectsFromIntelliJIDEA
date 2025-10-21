package File_And_Directory_Handling;

import java.io.File;

public class List_Directory_Contents {
    public static void main(String[] args){
        String directoryPath = "Projects/Java";
        File directory = new File(directoryPath);

        // List all files and directories in the specified directory
        String[] contents = directory.list();
        if (contents != null) {
            System.out.println("Contents of " + directoryPath + ":" );
            for (String fileName : contents) {
                System.out.println(fileName);
            }

            } else {
                System.out.println("The directory is empty or doesn't exist!");
            }
        }
    }

