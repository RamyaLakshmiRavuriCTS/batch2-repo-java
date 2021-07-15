package Assignment03;

public class UserMainCode {

    public static int countNoOfWords(String sentence1, String sentence2) {

        int count = 0;

        try{
            String[] words1 = sentence1.split(" ");
            String[] words2 = sentence2.split(" ");

            for (String word: words1) {
                if (word.equals(words2[1])) {
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sentence2 should have atleast two words");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}
