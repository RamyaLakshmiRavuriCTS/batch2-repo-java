import java.util.Scanner;

public class UniqueAndExistingCharacters {
    public static String replacePlus(String input1, String input2) {
        String replacedString;
        char[] input = input1.toCharArray();
        char[] data1 = input1.toLowerCase().toCharArray();
        char[] data2 = input2.toLowerCase().toCharArray();
        char[] result = new char[data1.length];

        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data2.length; j++) {
                if (data1[i] == data2[j]) {
                    result[i] = input[i];
                    break;
                }
                if (j == data2.length - 1) {
                    result[i] = '+';
                }
            }
        }
        replacedString = String.valueOf(result);
        return replacedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word");
        String input1 = scanner.nextLine();
        System.out.println("Enter second word");
        String input2 = scanner.nextLine();

        System.out.println(UniqueAndExistingCharacters.replacePlus(input1, input2));
    }
}
