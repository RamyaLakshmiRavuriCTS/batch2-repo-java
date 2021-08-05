package Assignment16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();

        String oldDate = UserMainCode.findOldDate(date1, date2);
        System.out.println(oldDate);
    }
}
