import java.util.ArrayList;

public class Mean extends Array {
    private double mean;
    public void setMean(double mean) {
        this.mean = mean;
    }
    public double getMean(ArrayList<Double> array, int count ) {
        double add = 0;
        for (int i = 0; i < array.size(); i++) {
            add += array.get(i); 
        }
        mean = add/count;
        return mean;
    }
    public String toString() {
        return "The mean of the set is: " + mean;
    }
}
