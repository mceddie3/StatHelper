import java.util.ArrayList;
import java.util.Collections;


public class Data {
    protected double median;
    protected double min;
    protected ArrayList<Double> array = new ArrayList<Double>();
    private String data;

    public Data(String t) {
        data = t;
    }
    public ArrayList<Double> getData() {
        String[] nums = (data.split("[ ,]+"));
        for (String i : nums) {
                array.add((Double.parseDouble(i)));
            }
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
