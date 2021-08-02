import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Integer integer1=scanner.nextInt();
        Integer integer2=scanner.nextInt();
        checkingStaticAndNonStaticMethods(integer1,integer2);
    }
    public static void checkingStaticAndNonStaticMethods(Integer integer1,Integer integer2){
        Integer absolute1=Math.abs(integer1);
        Integer absolute2=Math.abs(integer2);
        System.out.println("Absolute value of "+integer1+" is "+absolute1);
        System.out.println("Absolute value of "+integer2+" is "+absolute2);
        if(absolute1.equals(absolute2)){
            System.out.println(integer1+"="+integer2);
        }
        else {
            System.out.println(integer1+"!="+integer2);
        }
    }

}