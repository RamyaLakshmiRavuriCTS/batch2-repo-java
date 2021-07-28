package Maxvowels;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String string = sc.nextLine();

        if(string.length()>100)
            string.subSequence(0, 100);
        System.out.println(UserMainCode.getWordWithMaximumVowels(string));

    }

}
