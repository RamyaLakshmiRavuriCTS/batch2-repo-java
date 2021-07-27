package Assignment13;

public class UserMainCode {

    public static String swapPairs(String sentance) {

        if (sentance == null || sentance == "" || sentance.isEmpty()) {
            return sentance;
        }

        char[] chars = sentance.toCharArray();

        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }
}
