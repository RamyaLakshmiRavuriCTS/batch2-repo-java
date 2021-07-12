package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();
        System.out.println("enter the second string:");
        String string2 = sc.nextLine();
        System.out.println(display(string1, string2));
    }

    public static String display(String s, String s1) {
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