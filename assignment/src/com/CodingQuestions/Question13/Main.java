import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String string = sc.nextLine();
        System.out.println("swapped string is:");
        UserMainCode.swapPairs(string);

    }
}
