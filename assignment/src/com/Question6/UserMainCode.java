package Question6;
import java.util.Arrays;
public class UserMainCode {
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