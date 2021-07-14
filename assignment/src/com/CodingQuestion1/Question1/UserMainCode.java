package com.company;

public class UserMainCode {
    public static String replacePlus(String s, String s1) {
        String s2 = s.toLowerCase();
        String s3 = s1.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s2.charAt(i);
            if (s3.indexOf(c) == -1)
                sb.append("+");
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

