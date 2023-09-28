package org.example;

public abstract class BodyWithReactiveEngine implements FlyOnJetThrust{
    public static final Integer DEFAULT_HEIGHT = 1000;

    private Integer fuel;
    private Integer height;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public void fly() {
        this.height = DEFAULT_HEIGHT;
        System.out.println("is flying on height " + this.height);
    }

    @Override
    public void startJetEngines() {
        if(fuel > 0){
            System.out.println("engines were running");
        }
    }
}
