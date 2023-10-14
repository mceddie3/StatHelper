import java.util.ArrayList;
import Controller.Statistics;

public class SampleVarience implements Statistics {
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
}
