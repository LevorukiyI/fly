package org.example;

public class AirBalloon implements FlyOnArchimedeanForce{
    private Integer height;
    private Double archimedeanForce;

    public AirBalloon(){
        this.height = 0;
        this.archimedeanForce = 0.0;
    }

    @Override
    public void fly() {
        this.height = (int) (this.archimedeanForce + 1000);
        System.out.println("is flying on height " + this.height);
    }

    @Override
    public void increaseArchimedeanForce(double archimedeanForce) {
        this.archimedeanForce += archimedeanForce;
        System.out.println("archimedeanForce were increased to " + this.archimedeanForce);
    }

    @Override
    public void decreaseArchimedeanForce(double archimedeanForce) {
        if(this.archimedeanForce - archimedeanForce >= 0){
            this.archimedeanForce -= archimedeanForce;
            System.out.println("archimedeanForce were decreased to " + this.archimedeanForce);
        }
        else{
            System.out.println("archimedeanForce must not be less then 0");
        }
    }
}
