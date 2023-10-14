import java.util.ArrayList;

public class StandardError implements Statistics{
    private double SE;

    @Override
    public double Calculate(ArrayList<Double> array) {
        StandardDeviation sd = new StandardDeviation();
        
        SE = sd.Calculate(array)/Math.sqrt(array.size());
        return SE;
    }
    
}
