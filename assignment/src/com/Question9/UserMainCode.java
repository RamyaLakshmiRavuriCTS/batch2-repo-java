package Question9;

//Logic implemented class
public class UserMainCode {


    public static String storeMaxVowelWord(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0, max = 0;
        String maxVowelWord = null;
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
                maxVowelWord = word;
            }
        }
        return maxVowelWord;
    }
}