import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input string1:");
        String string1 = scanner.nextLine();
        System.out.println("enter the input string2:");
        String string2 = scanner.nextLine();
        int output = UserMainCode.getAnagram(string1,string2);
            if (output==1) {
                System.out.println("Anagrams.");
            } else {
                System.out.println("Not Anagrams.");
            }
        }
    }




