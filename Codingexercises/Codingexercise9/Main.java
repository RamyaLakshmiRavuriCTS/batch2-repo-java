package Vowels;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        System.out.println(UserMainCode.storeMaxVowelWord(sentence));
    }
}
