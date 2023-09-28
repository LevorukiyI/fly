package org.example;

public class MultiStageRocket extends Rocket{
    public static final Integer DEFAULT_AMOUNT_OF_STAGES = 3;
    private Integer amountOfStages;

    public MultiStageRocket(){
        super();
        this.amountOfStages = DEFAULT_AMOUNT_OF_STAGES;
    }

    public void dropStage(){
        if(this.amountOfStages > 1){
            this.amountOfStages--;
            System.out.println("were dropped one stage");
        }
    }
}
