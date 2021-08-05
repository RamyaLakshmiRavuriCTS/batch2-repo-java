package Assignment11;

import java.util.ArrayList;

public class UserMainCode {

    public static String highestScorer(ArrayList<String> students) {
        String maxScorer = "";
        int maxScore = 0;
        for (String s : students) {
            String[] strings = s.split("-");
            int sum = 0;
            for (int i = 1; i < 4; i++) {
                sum += Integer.parseInt(strings[i]);
            }
            if (sum > maxScore) {
                maxScorer = strings[0];
            }
            continue;
        }
        return maxScorer;
    }
}
