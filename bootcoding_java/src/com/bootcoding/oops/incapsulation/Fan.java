package com.bootcoding.oops.incapsulation;

public class Fan {
    final int MAX_SPEED=5;
    final int MIN_SPEED=0;
    int speed;
    public int regulator(int newSpeed){
        speed = newSpeed;
        if (speed>MAX_SPEED){
            speed=MAX_SPEED;
        } else if (speed<MIN_SPEED){
            speed=MIN_SPEED;
        }
        return speed;
    }
}
