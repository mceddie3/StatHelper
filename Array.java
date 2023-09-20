import java.util.ArrayList;
import java.util.Collections;


public class Array {
    protected int count;
    protected double median;
    protected double min;
    protected ArrayList<Double> array;

    public void setArray(ArrayList<Double> ary){
        this.array = ary;
    }
    public ArrayList<Double> getArray(){
        return array;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    public int getCount() {
        for (int i = 0; i < array.size(); i++) {
            count ++;
        }
        return count;
    }
    public ArrayList<Double> sort() {
        Collections.sort(array);
        return array;
    }
    public String toString() {
        String string = "";
        for (int i = 0; i < array.size(); i++){
            double dec = (double)array.get(i);
            double num = Math.ceil(dec);
            if (num != dec) {
                string += String.valueOf(dec) + " ";
            }
            else {
                string += String.valueOf((int)dec) + " ";
            }
        }
        string = string.trim();
        return "Sorted Array: " + "[" + string.replaceAll(" ", ", ") + "]";
    }
}
