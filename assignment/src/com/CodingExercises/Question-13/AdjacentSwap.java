import java.util.Scanner;

public class AdjacentSwap {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        System.out.println(swapPairs(string));
    }

    //Logic implement for adjacent swap
    public static String swapPairs(String string) {
        StringBuffer stringbuffer = new StringBuffer();
        if (string.length() % 2 == 0) {
            for (int i = 0; i < string.length() - 1; i = i + 2) {
                stringbuffer.append(string.charAt(i + 1)).append(string.charAt(i));
            }
        } else {
            for (int i = 0; i < string.length() - 1; i = i + 2) {
                stringbuffer.append(string.charAt(i + 1)).append(string.charAt(i));
            }
            stringbuffer.append(string.charAt(string.length() - 1));
        }
        return stringbuffer.toString();
    }
}
