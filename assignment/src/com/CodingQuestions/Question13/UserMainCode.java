public class UserMainCode {

    public static String swapPairs(String string){
        char temp;
        char[] inputArray=string.toCharArray();
        for(int i=0;i<inputArray.length-1;i+=2){
            temp=inputArray[i];
            inputArray[i]=inputArray[i+1];
            inputArray[i+1]=temp;
        }
        return String.valueOf(inputArray);
    }
}


