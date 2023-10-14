import java.util.ArrayList;
import Controller.Statistics;
public class Max implements Statistics {
    private double max;
    public void setMax(double max) {
        this.max = max;
    }
    public double Calculate(ArrayList<Double> array) {
        max = array.get(array.size() - 1);
        return max;
    }
}
