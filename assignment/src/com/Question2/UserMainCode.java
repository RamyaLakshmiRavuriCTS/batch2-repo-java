package Question2;

import java.util.*;
public class UserMainCode {

    public static int addUniqueEven(Integer[] arr){
        int sum=0;
        Set <Integer> set = new HashSet<>(Arrays.asList(arr));
        for(Integer num : set){
            if(num%2 ==0){
                sum+=num;
            }
        }
        if(sum==0){
            return -1;
        }
        return sum;
    }
}
