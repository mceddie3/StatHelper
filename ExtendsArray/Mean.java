import java.util.ArrayList;

public class Mean implements Statistics {
    private double mean;
    public void setMean(double mean) {
        this.mean = mean;
    }
    public double Calculate(ArrayList<Double> array) {
        double add = 0;
        for (int i = 0; i < array.size(); i++) {
            add += array.get(i); 
        }
        mean = add/array.size();
        return mean;
    }
    public String toString() {
        return "The mean of the set is: " + mean;
    }
}
