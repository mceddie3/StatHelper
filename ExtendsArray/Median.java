import java.util.ArrayList;

public class Median implements Statistics{
    private double median;
    public void setMedian(int median) {
        this.median = median;
    }
    public double Calculate(ArrayList<Double> array) {
        if ((array.size() % 2) == 1) {
            int index = array.size() / 2;
            median = array.get(index);
        }
        else if ((array.size() % 2) == 0) {
            int index = array.size() / 2;
            median = (array.get(index - 1) + array.get(index));
            median = median/2;
        }
    return median;
    }
    public String toString() {
        return "The median of the set is:         " + median;
    }
}
