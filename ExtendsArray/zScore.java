import java.util.ArrayList;

public class zScore {
    private double zScore;
    public double getZScore(ArrayList<Double> array, String input) {
        Mean m = new Mean();
        double mean = m.Calculate(array);
        StandardDeviation sd = new StandardDeviation();
        double std = sd.Calculate(array);
        zScore = (Integer.parseInt(input) - mean)/std;
        return zScore;
    }
}
