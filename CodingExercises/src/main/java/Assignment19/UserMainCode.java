package Assignment19;

public class UserMainCode {

    public static String getLastLetter(String sentance) {
        String[] words = sentance.split(" ");
        int n = words.length;
        String[] lastChars = new String[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int len = word.length();
            lastChars[i] = String.valueOf(word.charAt(len - 1));
        }
        return String.join("$", lastChars).toUpperCase();
    }
}
