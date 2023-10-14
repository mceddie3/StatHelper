import java.util.ArrayList;

public class Q3 implements Statistics{
    private double Q3;
    public void setQ1(double Q3) {
        this.Q3 = Q3;
    }    
    public double Calculate(ArrayList<Double> array) {
        int arySize = array.size();
        int index = arySize/4;
        if (arySize % 2 == 1) {
            if ((((arySize/2) + 1) % 2) == 1) {
                index = index + (arySize/2);
                Q3 = (array.get(index + 1) + array.get(index));
                Q3 = Q3 / 2;
            }
            else if ((((arySize/2) + 1) % 2) == 0){
                index = index + (arySize/2) + 1;
                Q3 = array.get(index);
            }
        }
        else if (arySize % 2 == 0){
            if (((((arySize) / 2) - 1 ) % 2) == 1) {
                index = index + (arySize/2);
                Q3 = (array.get(index - 1) + array.get(index));
                Q3 = Q3 / 2;
            }
            else if (((((arySize) / 2)- 1) % 2) == 0){
                index = index + (arySize/2);
                Q3 = array.get(index);
            }
        }
        return Q3;
    }
    public String toString() {
        return "The third quartile of the set is: " + Q3;
    }
}
