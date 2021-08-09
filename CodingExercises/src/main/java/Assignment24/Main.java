package Assignment24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stringDate = scanner.nextLine();
        int lastDayOfMonth = UserMainCode.getLastDayOfMonth(stringDate);
        System.out.println(lastDayOfMonth);
    }
}
