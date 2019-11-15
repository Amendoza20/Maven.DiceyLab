import java.util.Random;

public class Dice {

    private Integer numberOfDice;

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer roll(){
        Integer sum = 0;
        for(int i =0; i < numberOfDice; i++){
            sum += rollDie();
        }
        return sum;
    }

    private Integer rollDie(){
        Random random = new Random();

        return random.nextInt(6)+1;
    }




}
