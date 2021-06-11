package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	  String words=scanner.nextLine();
        System.out.println(ReverseAString(words));
        System.out.println(CountVowels(words));
    }
    public static String ReverseAString(String words){
        String output="";
        for(int i =words.length()-1;i>=0;i--){
            output=output+words.charAt(i);
        }
        return output;
    }
    public static int CountVowels(String words){
        int count=0;
        for(int i=0;i<words.length();i++){
            char c=words.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
}
