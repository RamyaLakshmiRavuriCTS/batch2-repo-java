import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String");
        String string1 = input.nextLine();
        System.out.println("Enter the second String");
        String string2 = input.nextLine();
        int result = -1;
        if (string1.length() == string2.length())
            result = getAnagram(string1, string2);
        if (result == 1)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }

    public static int getAnagram(String arg1, String arg2) {
        char[] array1 = arg1.toCharArray();
        char[] array2 = arg2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            if (map.containsKey(array1[i])) {
                map.put(array1[i], map.get(array1[i]) + 1);
            } else
                map.put(array1[i], 1);
        }
        for (int i = 0; i < array2.length; i++) {
            if (map.containsKey(array2[i])) {
                map.put(array2[i], map.get(array2[i]) - 1);
                if (map.get(array2[i]) == 0)
                    map.remove(array2[i]);
            } else
                return -1;
        }
        if (map.size() > 0)
            return -1;
        else return 1;
    }
}
