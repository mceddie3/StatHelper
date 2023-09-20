import java.util.ArrayList;

public class Min extends Array {
    public void setMin(int min) {
        this.min = min;
    }
    public double getMin(ArrayList<Double> array, int count) {
        min = array.get(0);
        return min;
    }
    public String toString() {
        return "The minimum of the set is:        " + min;
    }
}
