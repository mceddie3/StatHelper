import java.util.ArrayList;

public class Median extends Array{
    public void setMedian(int median) {
        this.median = median;
    }
    public double getMedian(ArrayList<Double> array, int count) {
        if ((count % 2) == 1) {
            int index = count / 2;
            median = array.get(index);
        }
        else if ((count % 2) == 0) {
            int index = count / 2;
            median = (array.get(index - 1) + array.get(index));
            median = median/2;
        }
    return median;
    }
    public String toString() {
        return "The median of the set is:         " + median;
    }
}
