import java.util.Scanner;
import java.lang.String;

public class ReverseArrayAndCountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        printReverseArrayAndNoOfVowels(sentence);

    }

    private static void printReverseArrayAndNoOfVowels(String sentence) {
        int count = 0;

        if(sentence.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            String lowerCase=sentence.toLowerCase();
            for(int i=0;i<lowerCase.length();i++) {
                char vowel=lowerCase.charAt(i);
                if(vowel=='a' || vowel=='e' ||vowel=='i' || vowel=='o' || vowel=='u'){
                    count++;
                }
            }
            char[] words=new char[sentence.length()];
            int a=words.length;
            for(int i=0;i<words.length;i++){
                words[a-1-i]=sentence.charAt(i);
            }

            String reverse=String.copyValueOf(words);
            System.out.println("Reverse of String:"+reverse);
            System.out.println("Number of Vowels: "+count);
        }
    }


}