import java.util.Arrays;

public class Bins {
    private Integer largestValue;
    private Integer smallestValue;
    private Integer [] bin;

    public Bins(Integer smallestValue, Integer largestValue){
        this.largestValue = largestValue;
        this.smallestValue = smallestValue;
        bin = new Integer[largestValue - smallestValue + 1];
        Arrays.fill(bin, 0);
        System.out.println(Arrays.toString(bin));
    }
    private Integer positionOf(Integer number){
        return number - smallestValue;
    }
    public void incrementBin(Integer number){
        bin[positionOf(number)]++;
    }
    public Integer getBinValue(Integer number){
        return bin[positionOf(number)];
    }
}
