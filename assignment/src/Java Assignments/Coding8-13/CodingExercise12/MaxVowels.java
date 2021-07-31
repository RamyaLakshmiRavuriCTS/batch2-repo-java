import java.util.Scanner;

//main class
public class MaxVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        if (sentence.length() > 100) {
            sentence = sentence.substring(0, 100);
        }
        System.out.println(getMaximumVowels(sentence));
    }
    public static String getMaximumVowels(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0, max = 0;
        String maxVowelWord = null;
        for (String word : words) {
            count = 0;
            //System.out.println(word);
            char[] characters = word.toLowerCase().toCharArray();
            for (char character : characters) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxVowelWord = word;
            }
        }
        return maxVowelWord;
    }
}