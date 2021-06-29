package src.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISException {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
//            try passing sourcefile.txt as argumrnt, you will get FileNotFoundException
            fis = new FileInputStream("src/monday/june14/exceptions/sourcefile.txt");
            fos = new FileOutputStream("targetfile.txt");

            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                fos.write(i);
                i = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fis.close();
                fos.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
