import java.util.Scanner;

public class ReverseAndVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        char[] array=string.toCharArray();
        reverseArray(array);
        countVowel(string);
    }
    public static void reverseArray(char[] ch){
        int maxIndex = ch.length -1;
        int halfLength = ch.length / 2;
        for(int i=0; i< halfLength; i++) {
            char temp = ch[i];
            ch[i] = ch[maxIndex -i];
            ch[maxIndex - i] = temp;
        }
        System.out.print("Reversed Array :");
        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]);
        System.out.println();
    }
    public static  void countVowel(String s){
        int count=0;
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print("Number of vowels :"+count);
    }
}
