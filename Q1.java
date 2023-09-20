import java.util.ArrayList;

public class Q1 extends Array {
    private double Q1;
    public void setQ1(double Q1) {
        this.Q1 = Q1;
    }    
    public double getQ1(ArrayList<Double> array, double median, int count) {
        if (count % 2 == 1) {
            if ((((count/2) + 1) % 2) == 1) {
                int index = count/4;
                Q1 = (array.get(index - 1) + array.get(index));
                Q1 = Q1 / 2;
            }
            else if ((((count/2) + 1) % 2) == 0){
                int index = count/4;
                Q1 = array.get(index);
            }
        }
        else if (count % 2 == 0){
            if (((((count) / 2) - 1 ) % 2) == 1) {
                int index = count/4;
                Q1 = (array.get(index - 1) + array.get(index));
                Q1 = Q1 / 2;
            }
            else if (((((count) / 2)- 1) % 2) == 0){
                int index = count/4;
                Q1 = array.get(index);
            }
        }
        return Q1;
    }
    public String toString() {
        return "The first quartile of the set is: " + Q1;
    }
}
