package src.exceptions;

public class ArrayIndexException {

    public static void main(String[] args) {

        int[] integers = {1,5,9,7,3};
//        change index  = 2 or 6 or any number to see the different outputs
        int index = 6;

        try{
//            System.out.println("Index at " + index + " in integers array is : " + integers[index]);
            System.out.print("Index is " + index +" =");
            System.out.println(integers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("End of main");
        }
    }
}
