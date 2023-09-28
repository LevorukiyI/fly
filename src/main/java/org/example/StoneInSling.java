package org.example;

public class StoneInSling implements FlyOnSpinLaunch{
    public static final Integer FLY_HEIGHT = 100;
    private Integer height;

    public StoneInSling(){
        this.height = 0;
    }

    public void fly(){
        System.out.println("is flying on height " + this.height);
    }

    public void spinLaunch(){
        this.height = FLY_HEIGHT;
    }
}
