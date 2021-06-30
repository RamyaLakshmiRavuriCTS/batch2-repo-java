package com.company;

public interface IBike {
    public final int SpeedLimitOfBike=90;
    default void SpeedLimit(){
        System.out.println( "Speed is " + SpeedLimitOfBike);
    }

    public void Company();

}
