import java.io.*;
import java.util.*;
//main class
public class Copy {

    //method for copying and writing file
    public static void copyContent(File one, File two) throws Exception {

        FileInputStream in = new FileInputStream(one);
        FileOutputStream out = new FileOutputStream(two);

        try {
            int character;
            while ((character = in.read()) != -1) {
                out.write(character);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
    //main method
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the source filename from where you have to read/copy :");
        String one = read.nextLine();

        File source = new File(one);
        System.out.println("Enter the destination filename where you have to write/paste :");

        String two = read.nextLine();
        File destination = new File(two);
        copyContent(source, destination);
    }
}
