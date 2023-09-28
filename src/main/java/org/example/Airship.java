package org.example;

public class Airship extends AirBalloon implements ConductControlledFlight{
    private Integer fuel;
    private Double pressureDifference;

    public Airship(){
        this.fuel = 0;
        this.pressureDifference = 0.0;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Double getPressureDifference() {
        return pressureDifference;
    }

    public void setPressureDifference(Double pressureDifference) {
        this.pressureDifference = pressureDifference;
    }

    @Override
    public void increasePressureDifference(double pressureDifference) {
        this.pressureDifference += pressureDifference;
        System.out.println("pressureDifference were increased to " + this.pressureDifference);
    }

    @Override
    public void decreasePressureDifference(double pressureDifference) {
        if(this.pressureDifference - pressureDifference >= 0){
            this.pressureDifference -= pressureDifference;
            System.out.println("pressureDifference were decreased to " + this.pressureDifference);
        }
        else{
            System.out.println("pressureDifference must not be less then 0");
        }
    }

    @Override
    public void startJetEngines() {
        if(fuel > 0){
            System.out.println("engines were running");
        }
    }
}
