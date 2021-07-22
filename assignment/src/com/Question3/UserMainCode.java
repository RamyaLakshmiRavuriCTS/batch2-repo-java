package Question3;

public class UserMainCode {

    public static int countNoOfWords(String s1, String s2){
        int count=0;
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");
        for(String w :w1){
                if(w2[1].equals(w)){
                    count++;
                }
        }
        return count;
    }
}
