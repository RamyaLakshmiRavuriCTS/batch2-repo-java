import java.util.Scanner;
import java.util.StringTokenizer;
public class StringOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input string1:");
        String s1 = sc.nextLine();
        System.out.println("enter the input string2:");
        String s2 = sc.nextLine();
        System.out.println("countNoOfWords:");
        UserMainCode.countNoOfWords(s1, s2);
    }

}