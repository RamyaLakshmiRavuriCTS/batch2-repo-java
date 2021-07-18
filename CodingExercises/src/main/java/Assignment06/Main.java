package Assignment06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        int anagram = UserMainCode.getAnagram(s1, s2);
        if(anagram == 1) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
