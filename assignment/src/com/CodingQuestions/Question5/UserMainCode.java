import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class UserMainCode {

    public static int getAverageOfOdd(HashMap<Integer,Integer> number1) {


        Set<Integer> keys = number1.keySet();
        Iterator<Integer> number2 = keys.iterator();
        int key,count=0,sum=0;
        while(number2.hasNext())
        {
            if((key=number2.next())%2!=0)
            {
                count++;
                sum+=number1.get(key);
            }
        }
        return sum/count;

    }
}
