public class UserMainCode {

    public static String getLastLetter(String input) {
        final String result;
        int count = 0;
        String[] sentence = input.toUpperCase().split(" ");
        char[] charArray = new char[2 * sentence.length];
        for (String word : sentence) {
            charArray[count++] = word.charAt(word.length() - 1);
            if (count < 2 * sentence.length - 1) {
                charArray[count++] = '$';
            }
        }
        result = String.valueOf(charArray);
        return result;
    }
}
