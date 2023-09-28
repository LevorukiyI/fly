package org.example;

public abstract class Rocket implements FlyOnSpinLaunch{
    public static final Integer FLY_SPEED_AFTER_SPINLAUNCH = 1000;
    public Integer flySpeed;

    public Rocket(){
        this.flySpeed = 0;
    }

    public void fly(){
        System.out.println("is flying on speed" + this.flySpeed);
    }

    public void spinLaunch(){
        this.flySpeed = FLY_SPEED_AFTER_SPINLAUNCH;
    }
}
