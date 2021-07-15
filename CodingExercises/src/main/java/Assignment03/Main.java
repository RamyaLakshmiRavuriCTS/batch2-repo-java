package Assignment03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence1 = scanner.nextLine();
        String sentence2 = scanner.nextLine();

        int count = UserMainCode.countNoOfWords(sentence1, sentence2);
        System.out.println(count);
    }
}
