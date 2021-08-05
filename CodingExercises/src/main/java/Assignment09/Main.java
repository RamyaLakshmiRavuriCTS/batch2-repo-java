package Assignment09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentance = scanner.nextLine();
        String word = UserMainCode.storeMaxVowelWord(sentance);
        System.out.println(word);
    }
}
