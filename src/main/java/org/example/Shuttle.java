package org.example;

public class Shuttle extends BodyWithReactiveEngine implements ConductUncontrolledFlight, ConductControlledFlight{
    public static final Integer FLY_SPEED_AFTER_SPINLAUNCH = 100;
    private Integer height;
    private Double pressureDifference;
    private Double archimedeanForce;

    public Shuttle(){
        this.height = 0;
        this.pressureDifference = 0.0;
        this.archimedeanForce = 0.0;
    }
    @Override
    public void spinLaunch() {
        this.height = FLY_SPEED_AFTER_SPINLAUNCH;
        System.out.println("were spin launched on height " + this.height);
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
    public void increaseArchimedeanForce(double archimedeanForce) {
        this.archimedeanForce += archimedeanForce;
        System.out.println("archimedeanForce were increased to " + this.pressureDifference);
    }

    @Override
    public void decreaseArchimedeanForce(double archimedeanForce) {
        if(this.archimedeanForce - archimedeanForce >= 0){
            this.archimedeanForce -= archimedeanForce;
            System.out.println("archimedeanForce were decreased to " + this.pressureDifference);
        }
        else{
            System.out.println("archimedeanForce must not be less then 0");
        }
    }
}
