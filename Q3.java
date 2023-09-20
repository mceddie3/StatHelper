import java.util.ArrayList;

public class Q3 {
    private double Q3;
    public void setQ1(double Q3) {
        this.Q3 = Q3;
    }    
    public double getQ3(ArrayList<Double> array, double median, int count) {
        if (count % 2 == 1) {
            if ((((count/2) + 1) % 2) == 1) {
                int index = count/4;
                index = index + (count/2);
                Q3 = (array.get(index + 1) + array.get(index));
                Q3 = Q3 / 2;
            }
            else if ((((count/2) + 1) % 2) == 0){
                int index = count/4;
                index = index + (count/2) + 1;
                Q3 = array.get(index);
            }
        }
        else if (count % 2 == 0){
            if (((((count) / 2) - 1 ) % 2) == 1) {
                int index = count/4;
                index = index + (count/2);
                Q3 = (array.get(index + 1) + array.get(index));
                Q3 = Q3 / 2;
            }
            else if (((((count) / 2)- 1) % 2) == 0){
                int index = count/4;
                index = index + (count/2) + 1;
                Q3 = array.get(index);
            }
        }
        return Q3;
    }
    public String toString() {
        return "The third quartile of the set is: " + Q3;
    }
}
