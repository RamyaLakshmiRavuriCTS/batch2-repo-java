package Strings;
class UserMainCode {
    public static String replacePlus(String strg1,String strg2) {
        char c1[] = strg1.toLowerCase().toCharArray();
        char[] c = strg1.toCharArray();
        char[] c2 = strg2.toLowerCase().toCharArray();
        char[] ch = new char[strg1.length()];
        for (int i = 0; i < strg1.length(); i++) {
            for (int j = 0; j < strg2.length(); j++) {
                if (c1[i] == c2[j]) {
                    ch[i] = c[i];
                    break;
                }
                if (j == strg2.length() - 1) {
                    ch[i] = '+';
                }
            }
        }
        strg1 = String.valueOf(ch);
        return strg1;
    }
}

