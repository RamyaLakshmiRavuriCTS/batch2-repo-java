package Question12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        if (sentence.length() > 100) {
            sentence = sentence.substring(0, 100);
        }
        System.out.println(UserMainCode.getWordWithMaximumVowels(sentence));
    }
}
