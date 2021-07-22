package Assignment09;

import java.util.*;

public class UserMainCode {

    public static String storeMaxVowelWord(String sentance) {

        int maxVowelCount = 0;
        String[] words = sentance.split(" ");
        Map<String, Integer> wordAndVcount = new HashMap<>(words.length);
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<String> maxCountWords = new ArrayList<>();

        for (String word : words) {
            int count = 0;
            for (Character c : word.toLowerCase().toCharArray()) {
                if (vowels.contains(c)) {
                    count++;
                }
            }
            if (maxVowelCount < count) {
                maxVowelCount = count;
            }
            wordAndVcount.put(word, count);
        }

        for (String word : words) {
            if (wordAndVcount.get(word) == maxVowelCount) {
                if (!maxCountWords.contains(word)) {
                    maxCountWords.add(word);
                }
            }
        }

        return maxCountWords.get(0);
    }
}
