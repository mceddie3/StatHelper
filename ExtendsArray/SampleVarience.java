import java.util.ArrayList;

public class SampleVarience implements Statistics {
    private double varience;
    private double ss;
    public double Calculate(ArrayList<Double> array) {
        double ss = 0.0;
        double sum = 0.0;
        double varience = 0.0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        double mean = sum/array.size();
        for (double i : array) {
            ss += Math.pow((i-mean), 2); 
        }
        varience = ss/(array.size()-1);
        return varience;
    }
    public String toString() {
        return "The Sum Of Squared Deviations is: " + ss + "\n" + "The Varience is:                  " + varience + "\n" + "The Standard Deviation is: ";
    }
}
