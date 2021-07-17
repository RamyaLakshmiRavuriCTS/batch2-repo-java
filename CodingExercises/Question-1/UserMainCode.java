public class UserMainCode {
    public static String replacePlus(String input1, String input2) {
        StringBuilder modified = new StringBuilder();
        char character;
        for (int i = 0; i < input1.length(); i++) {
            character = input1.charAt(i);
            if (input2.toLowerCase().indexOf(character) >= 0 || input2.toUpperCase().indexOf(character) >= 0) {
                modified.append(character);
            } else {
                modified.append("+");
            }
        }
        return modified.toString();
    }
}
