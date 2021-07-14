public class PlusReplace {
    public static String replace(String string1, String string2) {
        String input2 = string1.toLowerCase();
        String input3 = string2.toLowerCase();

        StringBuffer output = new StringBuffer();

        for (int i = 0; i < string1.length(); i++) {
            char character = input2.charAt(i);
            if (input3.indexOf(character) == -1)
                output.append("+");
            else
                output.append(string1.charAt(i));
        }
        return output.toString();

    }
}
