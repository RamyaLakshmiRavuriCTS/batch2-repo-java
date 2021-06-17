import java.util.Scanner;

public class ReverseArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = sc.nextLine();
        reverse(string);
    }


    
    public static void reverse(String string ){
        int stringLen = string.length();
        char [] words = new char[stringLen];
        int count=0;
        int wordsLen = words.length;
        for(int i=0;i<wordsLen;i++){
            int j = wordsLen-1-i;
            words[j]=string.charAt(i);
            if(words[j]=='a' || words[j]=='e'|| words[j]=='i' || words[j]=='o' || words[j]=='u'|| words[j]=='A'|| words[j]=='E' || words[j]=='I' || words[j]=='O' || words[j] =='U'){
                count++;
            }
        }

        String reverse=String.copyValueOf(words);

        System.out.println("Reversed array: "+reverse);
        System.out.println("Count of vowels: "+ count);
    }
}