import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String string = sc.nextLine();
 if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        System.out.println("swapped string is:");
        System.out.println(UserMainCode.swapPairs(string));

    }
}
