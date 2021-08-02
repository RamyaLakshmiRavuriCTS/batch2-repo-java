package Assignment19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentance = scanner.nextLine();
        String finalString = UserMainCode.getLastLetter(sentance);
        System.out.println(finalString);
    }
}
