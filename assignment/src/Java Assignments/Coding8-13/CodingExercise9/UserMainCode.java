public class UserMainCode {
    public static String storeMaxVowelWord(String sentence) {
        String[] array = sentence.split(" ");
        String resultWord = "No word has vowels";
        int maxVowel = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == 'a' || array[i].charAt(j) == 'e' || array[i].charAt(j) == 'i' || array[i].charAt(j) == 'o' || array[i].charAt(j) == 'u') {
                    count++;
                }
                if (count > maxVowel) {
                    maxVowel = count;
                    resultWord = array[i];
                }
            }
        }
        return resultWord;
    }
}
