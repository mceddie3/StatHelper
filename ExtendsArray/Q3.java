import java.util.ArrayList;
import Controller.Statistics;

public class Q3 implements Statistics{
    private double Q3;
    public void setQ1(double Q3) {
        this.Q3 = Q3;
    }  
    public double Calculate(ArrayList<Double> array) {
        int arySize = array.size() + 1; 
        if (arySize % 4 == 0) {
            Q3 = array.get(3 * (arySize/4)-1);
        }
        else {
            Q3 = (array.get((3 * arySize/4)-1) + array.get(3 * arySize/4))/2;
        }
        return Q3;
    }  
    
}
