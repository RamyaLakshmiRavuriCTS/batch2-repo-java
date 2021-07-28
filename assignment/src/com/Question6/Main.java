package Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence1 = scanner.nextLine();
        String sentence2 = scanner.nextLine();
        int result = UserMainCode.getAnagram(sentence1, sentence2);
        if(result == 1){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
