import java.awt.event.*;
import java.util.ArrayList;


public class Main extends GUI implements ActionListener{
    private static String str;
    final ArrayList<Double> ary = new ArrayList<Double>();
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.getGui();
    }
    public Main() {
        button.addActionListener(this);
        max.addActionListener(this);
        min.addActionListener(this);
        mean.addActionListener(this);
        median.addActionListener(this);
        q1.addActionListener(this);
        q3.addActionListener(this);
        sampleVarience.addActionListener(this);
        zScore.addActionListener(this);
        fns.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent event) {
        Object press = event.getSource();
        if (press == "Submit") {
            str = text.getText();
            if (str != "") {
                String[] nums = (str.split("[ ,]+"));
                for (String i : nums) {
                    ary.add((Double.parseDouble(i)));
                    panel5.add(label3);
                }
            } 
        }
        Array a = new Array();
        a.setArray(ary);
        a.getArray();
        a.sort();
        System.out.println("\n" + a.toString());
        Min min = new Min();
        Max max = new Max();
        Median med = new Median();
        Q1 q = new Q1();
        Q3 f = new Q3();
        Mean mean = new Mean();
        SampleVarience sv = new SampleVarience();
        zScore zs = new zScore();
        int c = a.getCount();
        ArrayList<Double> d = a.sort();
        
        if (press == max) {
            max.getMax(d, c);
            System.out.println(max.toString());
        }
        if (press == min)  {
            min.getMin(d, c);
            System.out.println(min.toString());
        }
        if (press == median) {
            System.out.println(med.getMedian(d, c));
        }
        if (press == fns) {
            min.getMin(d, c);
            max.getMax(d, c);
            med.getMedian(d, c);
            q.getQ1(d, med.getMedian(d, c), c);
            f.getQ3(d, med.getMedian(d, c), c);
            System.out.println("Amount of numbers in set: " + c + "\n\n" + min.toString() + "\n" + q.toString() + "\n" + med.toString()  + "\n" + f.toString() + "\n" + max.toString());
        }
        if (press == mean) {
            mean.getMean(d, c);
            System.out.println(mean.toString());
        }
        if (press == sampleVarience) {
            sv.getStandardDeviation(sv.getVarience(d, sv.getSumOfSquaredDeviations(d, mean.getMean(d, c))));
            System.out.println(sv.toString());
        }
        if (press == zScore) {
            zs.getZScore(mean.getMean(d, c), sv.getStandardDeviation(sv.getVarience(d, sv.getSumOfSquaredDeviations(d, mean.getMean(d, c)))));
            System.out.println(zs.toString());
        }
    }
}