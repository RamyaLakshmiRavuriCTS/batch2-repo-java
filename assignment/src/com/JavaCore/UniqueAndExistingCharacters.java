import java.util.HashSet;
import java.util.Scanner;

public class UniqueAndExistingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String");
        String string1 = input.nextLine();
        System.out.println("Enter the second String");
        String string2 = input.nextLine();
        String result = replacePlus(string1, string2);
        System.out.println(result);
    }

    public static String replacePlus(String arg1, String arg2) {
        HashSet<Character> set = new HashSet<>();
        char[] checkArray = arg2.toLowerCase().toCharArray();
        char[] returnArray = arg1.toCharArray();
        char[] resultArray = arg1.toLowerCase().toCharArray();
        for (int i = 0; i < checkArray.length; i++) {
            set.add(checkArray[i]);
        }
        for (int i = 0; i < resultArray.length; i++) {
            if (!set.contains(resultArray[i])) {
                returnArray[i] = '+';
            }

        }
        //System.out.println(returnArray);
        String result = new String(returnArray);
        return result;
    }
}
