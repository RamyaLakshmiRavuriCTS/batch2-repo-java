package Question12;

public class UserMainCode {
    public static String getWordWithMaxVowels(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0, max = 0;
        String maxWord = null;
        for (String word : words) {
            count = 0;
            char[] characters = word.toLowerCase().toCharArray();
            for (char character : characters) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxWord = word;
            }
        }
        return maxWord;
    }
}
