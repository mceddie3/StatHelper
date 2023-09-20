import java.util.ArrayList;

public class Max extends Array {
    private double max;
    public void setMax(double max) {
        this.max = max;
    }
    public double getMax(ArrayList<Double> array, int count) {
        max = array.get(count - 1);
        return max;
    }
    public String toString() {
        return "The maximum of the set is:        " + max;
    }
}
