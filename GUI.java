import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import java.awt.Font;
class GUI {
    protected JLabel label;
    protected JLabel label1;
    protected JLabel label2;
    protected JLabel label3;
    protected JButton button;
    protected JPanel panel;
    protected JPanel panel1;
    protected JPanel panel2;
    protected JPanel panel3;
    protected JPanel panel4;
    protected JPanel panel5;
    protected JButton max;
    protected JButton min;
    protected JButton mean;
    protected JButton median;
    protected JButton q1;
    protected JButton q3;
    protected JButton sampleVarience;
    protected JButton zScore;
    protected JButton fns;
    protected JFrame frame;
    protected JTextArea text;

 
    public void getGui(){
        frame = new JFrame("Stat Helper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,900);
        getText();
        getButtons();
        getLabels();
        getPanels();
        frame.add(panel1);
        frame.setVisible(true);

    }
    public void getText() {
        text = new JTextArea("Enter Dataset", 5, 20);
    }
    public void getButtons() {
        button = new JButton("Submit");
        max = new JButton("Max");
        min = new JButton("Min");
        mean = new JButton("Mean");
        median = new JButton("Median");
        q1 = new JButton("First Quartile");
        q3 = new JButton("Third Quartile");
        sampleVarience = new JButton("Sample Varience");
        zScore = new JButton("Z-Score");
        fns = new JButton("Five Number Summary");

    }
    public void getLabels(){
        label = new JLabel("Welcome to Stat Helper!");
        label1 = new JLabel("To get started, please enter your dataset:");
        label2 = new JLabel("Press what you would like to calculate:");
        label.setFont(new Font("Verdana", Font.PLAIN, 40));
        label1.setFont(new Font("verdana", Font.PLAIN, 20));
        label2.setFont(new Font("verdana", Font.PLAIN, 20));
        label3 = new JLabel("Dataset successfully submitted");
    }
    public void getPanels() {
        panel1 = new JPanel();
        panel1.add(label);
        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(50,500,50,500));
        panel2.add(label1);
        panel1.setBorder(new EmptyBorder(50,500,50,500));
        panel = new JPanel();
        panel.add(text);
        panel.add(button);
        panel.setBorder(new EmptyBorder(30,500,30,500));
        panel3 = new JPanel();
        panel3.add(max);
        panel3.add(min);
        panel3.add(mean);
        panel3.add(median);
        panel3.add(q1);
        panel3.add(q3);
        panel3.add(sampleVarience);
        panel3.add(zScore);
        panel3.add(fns);
        panel4 = new JPanel();
        panel4.add(label2);
        panel5 = new JPanel();
        panel1.add(panel2);
        panel1.add(panel);
        panel1.add(panel5);
        panel1.add(panel4);
        panel1.add(panel3);
    }
}