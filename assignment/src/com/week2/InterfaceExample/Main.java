package com.company;

public class Main {
    public static void main(String[] args) {

        IBike bike= new RoyalEnfield();
        bike.Company();
        bike.SpeedLimit();
        bike = new KTM();
        bike.Company();
        bike.SpeedLimit();
    }
}
