public class Simulation {
    private Dice dice;
    private Bins bins;
    private Integer numberOfTosses;
    private Integer numberOfDices;

    public Simulation(Integer numberOfDices, Integer numberOfTosses){
        this.numberOfTosses = numberOfTosses;
        this.numberOfDices = numberOfDices;
        this.dice = new Dice(numberOfDices);
        this.bins = new Bins(numberOfDices,numberOfDices * 6);
    }
    public void runSimulation(){
       for(int i = 0; i<numberOfTosses; i++) {
           bins.incrementBin(dice.roll());
       }
    }

    public void printResults(){
        StringBuilder builder = new StringBuilder("***\n")
                .append(String.format("Simulation of %d dice tossed for %d times.\n",numberOfDices, numberOfTosses))
                .append("***\n\n");
        for(int i = numberOfDices; i <= numberOfDices * 6; i++){
            builder.append(String.format("%2d :",i))
                    .append(String.format("%10d:",bins.getBinValue(i)))
                    .append(String.format(" %01.2f ",(double) bins.getBinValue(i)/numberOfTosses));
            for(int j = 10000; j < bins.getBinValue(i); j+= 10000){
                builder.append("*");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
