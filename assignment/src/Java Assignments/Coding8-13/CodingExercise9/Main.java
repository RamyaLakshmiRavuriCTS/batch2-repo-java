import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = input.nextLine();
        System.out.println("The word that has maximum number of vowels is : " + UserMainCode.storeMaxVowelWord(sentence.toLowerCase()));
    }
}