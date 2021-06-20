package com.cts;
public class JavaMainClass {
z
    public static void main(String[]args){
        Honda honda = new Honda();
        honda.changeGear(2);
        honda.move("Honda");

        RoyalEnfield royal = new RoyalEnfield();
        royal.changeGear(3);
        royal.move("Royal Enfield");
    }

}
