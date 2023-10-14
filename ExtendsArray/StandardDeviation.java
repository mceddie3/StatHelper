import java.util.ArrayList;

public class StandardDeviation implements Statistics{
    private double std;

    public double Calculate(ArrayList<Double> array) {
        SampleVarience sv = new SampleVarience();
        std = Math.sqrt(sv.Calculate(array));
        return std;
    }
}
