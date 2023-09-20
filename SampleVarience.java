import java.util.ArrayList;

public class SampleVarience extends Array {
    private double ss = 0;
    private double varience;
    private double std;
    public double getSumOfSquaredDeviations(ArrayList<Double> array, double mean) {
        for (double i : array) {
            ss += Math.pow((i-mean), 2); 
        }
        return ss;
    }
    public double getVarience(ArrayList<Double> array, double ss) {
        varience = ss/(array.size() - 1);
        return varience;
    }
    public double getStandardDeviation(double varience) {
        std = Math.sqrt(varience);
        return std;
    }
    public String toString() {
        return "The Sum Of Squared Deviations is: " + ss + "\n" + "The Varience is:                  " + varience + "\n" + "The Standard Deviation is: " + std;
    }
}
