public class UserMainCode {

    public static String storeMaxVowelWord(String string) {
        String[] sentence = string.split(" ");
        int count = 0, max = 0;
        String maxVowelWord = null;
        for (String word : sentence) {
            count = 0;
            char[] charset = word.toLowerCase().toCharArray();
            for (char character : charset) {
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
