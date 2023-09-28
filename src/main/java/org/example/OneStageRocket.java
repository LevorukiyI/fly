package org.example;

public class OneStageRocket extends Rocket{
    private int airResistance;
    public OneStageRocket(){
        super();
    }

    public int getAirResistance() {
        return airResistance;
    }

    public void setAirResistance(int airResistance) {
        if(airResistance >= 0) {
            this.airResistance = airResistance;
        }
    }
}
