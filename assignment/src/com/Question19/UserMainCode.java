package Question19;

public class UserMainCode {
    public static String getLastLetter(String sentence) {
        final String output;
        int count = 0;
        String[] words = sentence.toUpperCase().split(" ");
        char[] charArray = new char[2 * words.length];
        for (String word : words) {
            charArray[count++] = word.charAt(word.length() - 1);
            if (count < 2 * words.length - 1) {
                charArray[count++] = '$';
            }
        }
        output = String.valueOf(charArray);
        return output;
    }
}
