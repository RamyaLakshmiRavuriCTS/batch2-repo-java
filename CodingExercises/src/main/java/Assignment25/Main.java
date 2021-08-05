package Assignment25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringDate = scanner.nextLine();
        String isEligible = UserMainCode.getAge(stringDate);
        System.out.println(isEligible);
    }
}
