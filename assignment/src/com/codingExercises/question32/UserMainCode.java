package question32;

public class UserMainCode {

    public static void checkStaticAndNonStaticMethods(Integer integer1,Integer integer2){
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
