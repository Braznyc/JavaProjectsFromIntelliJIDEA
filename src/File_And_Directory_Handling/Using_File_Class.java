package File_And_Directory_Handling;

import java.io.File;

public class Using_File_Class {
    public static void main(String[] args){

        // File class is used to handle files (creation, checking existence, renaming, moving and deleting files)
        File myFile = new File("example text.txt");

        // Check if the file exists. In this case the file doesn't exist because it wasn't saved to a location.

        if (myFile.exists()){
            System.out.println("The file exists!");
        }else {
            System.out.println("The file doesn't exist!"); // This will be the output because the file hasn't been created yet. "File" can't save texts to a location.
        }
    }


}
