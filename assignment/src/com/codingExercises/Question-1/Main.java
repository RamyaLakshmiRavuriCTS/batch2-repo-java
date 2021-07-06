import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first string");
        String input1 = SCANNER.nextLine();
        System.out.println("Enter second string");
        String input2 = SCANNER.nextLine();
        System.out.println(UserMainCode.replacePlus(input1, input2));


    }

}
