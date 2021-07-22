//logic implemented class
public class UserMainCode {
    //count the occurence of word
    public static int countNoOfWords(String sentence1, String sentence2) {
        int count = 0;
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        for (String word : words1) {
            if (words2[1].equals(word)) {
                count++;
            }
        }
        return count;
    }
}
