package Anagrams;



import java.util.Arrays;
//logic implemented class
public class UserMainCode {

    //check the given strings are Anagrams or not
    public static int getAnagram(String sentence1,String sentence2){
        char[] characterset1=sentence1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] characterset2=sentence2.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(characterset1);
        Arrays.sort(characterset2);
        if(Arrays.equals(characterset1, characterset2)){
            return 1;
        }
        return -1;
    }
}
