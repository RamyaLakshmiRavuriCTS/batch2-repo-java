import java.util.Arrays;
import java.util.HashSet;

public class UserMainCode {
    public static int addUniqueEven(Integer[] arr){
        int sum=0;
        HashSet<Integer> hashset = new HashSet<>(Arrays.asList(arr));
        for(Integer number : hashset){
            if(number %2 ==0){
                sum+= number;
            }
        }
        if(sum==0){
            return -1;
        }
        return sum;
    }
}
