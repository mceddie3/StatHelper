import java.util.ArrayList;

public class Q1 implements Statistics {
    private double Q1;  
    public double Calculate(ArrayList<Double> array) {
        int arySize = array.size();
        int index = arySize/4;
        if (arySize % 2 == 1) {
            if ((((arySize/2) + 1) % 2) == 1) {
                Q1 = (array.get(index - 1) + array.get(index));
                Q1 = Q1 / 2;
            }
            else if ((((arySize/2) + 1) % 2) == 0){
                Q1 = array.get(index);
            }
        }
        else if (arySize % 2 == 0){
            if ((((arySize / 2) - 1 ) % 2) == 1) {
                Q1 = (array.get(index - 1) + array.get(index));
                Q1 = Q1 / 2;
            }
            else if (((((arySize) / 2)- 1) % 2) == 0){
                Q1 = array.get(index);
            }
        }
        return Q1;
    }
    public String toString() {
        return "The first quartile of the set is: " + Q1;
    }
}
