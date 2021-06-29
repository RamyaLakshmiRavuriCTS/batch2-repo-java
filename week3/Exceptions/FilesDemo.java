import java.io.*;
import java.util.*;

public class FilesDemo {

    public  void copyContent(File inputFile, File outputFile) throws Exception
    {
        FileInputStream input = new FileInputStream(inputFile);
        FileOutputStream output = new FileOutputStream(outputFile);

        try {
            int bytesRead;
            while ((bytesRead = input.read()) != -1)
            {
                output.write(bytesRead);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if (input != null) {
                input.close();
            }

            if (output != null) {
                output.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception
    {
        FilesDemo filedemo =new FilesDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  filename from where you have to read/copy :");
        String inputFile = sc.nextLine();
        File source = new File(inputFile);


        System.out.println("Enter the  filename where you have to write/paste :");
        String outputFile = sc.nextLine();
        File target = new File(outputFile);
        filedemo.copyContent(source, target);
    }
}
