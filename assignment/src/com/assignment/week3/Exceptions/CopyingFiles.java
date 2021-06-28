package Exceptions;

import java.io.*;
import java.util.Scanner;

public class CopyingFiles {
    private static final int BUFFER_SIZE = 4096;

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

