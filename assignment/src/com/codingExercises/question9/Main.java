package question9;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(UserMainCode.storeMaxVowelWord(sentence));
    }
}
