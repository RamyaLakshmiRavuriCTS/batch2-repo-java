package Assignment23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringDate = scanner.nextLine();
        String formattedDate = UserMainCode.convertDateFormat(stringDate);
        System.out.println(formattedDate);
    }
}
