import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String");
        String string1 = input.nextLine();
        System.out.println("Enter second String");
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
        char[] arr1 = arg1.toCharArray();
        char[] arr2 = arg2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else
                map.put(arr1[i], 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])) {
                map.put(arr2[i], map.get(arr2[i]) - 1);
                if (map.get(arr2[i]) == 0)
                    map.remove(arr2[i]);
            } else
                return -1;
        }
        if (map.size() > 0)
            return -1;
        else return 1;
    }
}