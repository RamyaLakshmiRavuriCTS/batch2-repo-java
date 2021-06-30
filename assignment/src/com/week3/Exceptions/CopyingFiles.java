package Exceptions;

import java.io.*;
import java.util.Scanner;

/*This class copy the content in one file to another file
 * if file location is not found, it throws an Exception
 * that Exception is FileNotFoundException*/

public class CopyingFiles {
    private static final int BUFFER_SIZE = 4096;

     /*Main method
     * it takes file locations in dynamic way
     * and copy the content in source file into destination file
     * if any one of the files is not present then it shows an Exception
     * that has handled by catch block */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFile = sc.nextLine();
        String outputFile = sc.nextLine();
        File input = new File(inputFile);
        File output = new File(outputFile);

        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile);
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Successfully Copied the files");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

