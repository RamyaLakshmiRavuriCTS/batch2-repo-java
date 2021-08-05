package Assignment13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String swappedWord = UserMainCode.swapPairs(word);
        System.out.println(swappedWord);
    }
}
