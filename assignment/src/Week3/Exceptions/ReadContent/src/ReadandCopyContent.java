import java.io.*;
import java.util.Scanner;
public class ReadandCopyContent{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            FileInputStream fr = new FileInputStream("C:\\Users\\GANGADHAR YALASA\\Readcontent\\input.txt");
            FileOutputStream fw = new FileOutputStream("C:\\Users\\GANGADHAR YALASA\\Readcontent\\output.txt");
            String str = " ";
            int i;
            while ((i = fr.read()) != -1) {
                str += (char)i;
            }
            System.out.println(str);
            char ch[]=str.toCharArray();
            for(int j=0;j<str.length();j++) {
                fw.write((ch[j]));
            }
            fr.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("There are some IOException");
        }
    }
}