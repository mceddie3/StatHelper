import java.util.ArrayList;

public class Min implements Statistics {
    private double min;
    public void setMin(int min) {
        this.min = min;
    }
    public double Calculate(ArrayList<Double> array) {
        min = array.get(0);
        return min;
    }
    public String toString() {
        return "The minimum of the set is:        " + min;
    }
}
