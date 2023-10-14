import java.util.ArrayList;
import Controller.Statistics;

public class Q1 implements Statistics {
    private double Q1;  
    public double Calculate(ArrayList<Double> array) {
        int arySize = array.size() + 1; 
        if (arySize % 4 == 0) {
            Q1 = array.get((arySize/4)-1);
        }
        else {
            Q1 = (array.get((arySize/4)-1) + array.get(arySize/4))/2;
        }
        return Q1;
    }
}
