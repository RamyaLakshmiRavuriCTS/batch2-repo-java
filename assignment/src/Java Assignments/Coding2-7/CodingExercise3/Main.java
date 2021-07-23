import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first sentence");
        String words1 = input.nextLine();
        System.out.println("Enter the second sentence");
        String words2 = input.nextLine();
        int result = countNoOfWords(words1, words2);

    }

    public static int countNoOfWords(String arg1, String arg2) {
        String[] input1 = arg1.split(" ");
        String[] input2 = arg2.split(" ");
        int count = 0;
        for (int i = 0; i < input1.length; i++) {
            if (input1[i].equals(input2[1])) {
                count++;
            }

        }
        return count;
    }
}