import java.util.Scanner;

import static java.lang.String.copyValueOf;

public class ReverseArray {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        reverse(msg);
    }
    public static void reverse(String msg){
        if(msg.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            int stringLen = msg.length();

            char[] words = new char[stringLen];
            int count = 0;
            int wordsLen = words.length;
            for (int i = 0; i < wordsLen; i++) {
                int j = wordsLen - 1 - i;
                words[j] = msg.charAt(i);
                if (words[j] == 'a' || words[j] == 'e' || words[j] == 'i' || words[j] == 'o' || words[j] == 'u' || words[j] == 'A' || words[j] == 'E' || words[j] == 'I' || words[j] == 'O' || words[j] == 'U') {
                    count++;
                }
            }
            String reverse = copyValueOf(words);
            System.out.println(reverse);
            System.out.println("Count of vowels:" + count);
        }
    }
}
