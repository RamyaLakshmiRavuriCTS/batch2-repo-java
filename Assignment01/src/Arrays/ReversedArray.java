package Arrays;

import java.util.Scanner;

public class ReversedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuffer reversedString = new StringBuffer();
        String sample = "Hello Team";
        System.out.println("Enter a String : ");
        sample = sc.nextLine();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelsCount = 0;
        
        for (int i = sample.length()-1; i >= 0; i--) {
            
            Character letter = sample.charAt(i);
            reversedString.append(letter);
            
            for (char c : vowels) {
                if ((c == Character.toLowerCase(letter))) {
                    vowelsCount++;
                    
                }
            }
        }
        System.out.println("Reversed Array : " + reversedString);
        System.out.println("Number of Vowels : " + vowelsCount);
        sc.close();
    }
}

