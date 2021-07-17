public class UserMainCode {
    public static  String   replacePlus(String str1, String str2) {
        char ch1[] = str1.toLowerCase().toCharArray();
        char[] c = str1.toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        char[] ch = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (ch1[i] == ch2[j]) {
                    ch[i] = c[i];
                    break;
                }
                if (j == str2.length() - 1) {
                    ch[i] = '+';
                }
            }
        }
        str1 = String.valueOf(ch);
        return str1;
    }
}
