import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Controller.Statistics;
import Model.Data;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class GUI implements ActionListener {
    protected String display = "Result will be posted here after 'Calculate' is pressed";
    protected String didSubmit = "Please press submit after entering dataset";
    protected String zScoreDisplay = "";
    protected ArrayList<Double> array = new ArrayList<Double>();
    protected JLabel mainTitle;
    protected JLabel subTitle;
    protected JLabel label2;
    protected JLabel label3;
    protected JLabel displayLabel;
    protected JLabel submitSuccess;
    protected JLabel zScoreLabel;
    protected JButton submitButton;
    protected JButton calculateZScore;
    protected JButton calculate;
    protected JComboBox<String> dropDown;
    protected JPanel panel;
    protected JPanel mainPanel;
    protected JPanel panel2;
    protected JPanel panel3;
    protected JPanel panel4;
    protected JPanel zScorePanel;
    protected JFrame frame;
    protected JTextArea dataSetText;
    protected JTextArea zScoreText;

    // privagte DataSaver dataSaver;


    public void getGui() {
        frame = new JFrame("Stat Helper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 900);
        getDataSetText();
        getButtons();
        getDropDown();
        getLabels();
        getPanels();
        frame.add(mainPanel);
        frame.setVisible(true);

    }

    public void getBoxPlot() {

    }

    public void getDataSetText() {
        dataSetText = new JTextArea("Enter Dataset", 5, 20);
        zScoreText = new JTextArea("Data Point", 1, 10);
    }

    public void getButtons() {
        // add action listener to button
        // make a drop down for the rest of the options
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        calculate = new JButton("Calculate");
        calculate.addActionListener(this);
        calculateZScore = new JButton("Calculate Z-Score");
        calculateZScore.addActionListener(this);
    }
    public void getDropDown() {
        String options[] = {"Max", "Min", "Mean", "Median", "First Quartile", "Third Quartile", "Standard Deviation", "Sample Varience", "Standard Error", "Z-Score"};
        dropDown = new JComboBox<String>(options);
    }

    public void getLabels() {
        mainTitle = new JLabel("Welcome to Stat Helper!");
        subTitle = new JLabel("To get started, please enter your dataset:");
        label2 = new JLabel("Choose what you would like to calculate:");
        mainTitle.setFont(new Font("verdana", Font.PLAIN, 40));
        subTitle.setFont(new Font("verdana", Font.PLAIN, 20));
        label2.setFont(new Font("verdana", Font.PLAIN, 20));
        displayLabel = new JLabel(display);
        displayLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        submitSuccess = new JLabel(didSubmit);
    }

    public void getPanels() {
        mainPanel = new JPanel();
        mainPanel.add(mainTitle);
        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(50, 500, 50, 500));
        panel2.add(subTitle);
        mainPanel.setBorder(new EmptyBorder(50, 500, 500, 500));
        panel = new JPanel();
        panel.add(dataSetText);
        panel.add(submitButton);
        panel.add(submitSuccess);
        panel.setBorder(new EmptyBorder(0, 500, 40, 500));
        panel3 = new JPanel();
        panel3.setBorder(new EmptyBorder(0, 500, 50, 500));
        panel3.add(dropDown);
        panel3.add(calculate);
        panel4 = new JPanel();
        panel4.setBorder(new EmptyBorder(0, 500, 20, 500));
        panel4.add(label2);
        mainPanel.add(panel2);
        mainPanel.add(panel);
        mainPanel.add(panel4);
        mainPanel.add(panel3);
        zScorePanel = new JPanel();
        zScorePanel.setBorder(new EmptyBorder(0, 500, 40, 500));
        zScorePanel.add(zScoreText);
        zScorePanel.add(calculateZScore);
        zScorePanel.setVisible(false);
        mainPanel.add(zScorePanel);
        mainPanel.add(displayLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Submit":
            try {
                String t = dataSetText.getText();
                Data d = new Data(t);
                array = d.getData();
                didSubmit = "Dataset successfuly submitted";
                submitSuccess.setText(didSubmit);
                submitSuccess.setForeground(new java.awt.Color(0, 175, 0));
                // Data d = new Data(ExcelFile);  
            } 
            catch (Exception error) {
                didSubmit = "We didn't understand your answer. Please try again.";
                submitSuccess.setText(didSubmit);
                submitSuccess.setForeground(Color.RED);
            }
                break;
            case "Calculate":
                if (!didSubmit.equals("Dataset successfuly submitted")) {
                    display = "Please submit dataset first!";
                    displayLabel.setText(display);
                    displayLabel.setForeground(Color.RED);
                }
                Statistics MyCalc;
                double result = 0.0;
                zScorePanel.setVisible(false);
                switch (dropDown.getSelectedItem().toString()) {
                    case "Max":
                        MyCalc = new Max();
                        result = MyCalc.Calculate(array);
                        display = "The maximum in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Min":
                        MyCalc = new Min();
                        result = MyCalc.Calculate(array);
                        display = "The minimum in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Mean":
                        MyCalc = new Mean();
                        result = MyCalc.Calculate(array);
                        display = "The mean in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Median":
                        MyCalc = new Median();
                        result = MyCalc.Calculate(array);
                        display = "The median in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "First Quartile":
                        MyCalc = new Q1();
                        result = MyCalc.Calculate(array);
                        display = "The first quartile in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Third Quartile":
                        MyCalc = new Q3();
                        result = MyCalc.Calculate(array);
                        display = "The third quartile in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Sample Varience":
                        MyCalc = new SampleVarience();
                        result = MyCalc.Calculate(array);
                        display = "The sample varience in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Standard Deviation":
                        MyCalc = new StandardDeviation();
                        result = MyCalc.Calculate(array);
                        display = "The Standard Deviation in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Standard Error":
                        MyCalc = new StandardError();
                        result = MyCalc.Calculate(array);
                        display = "The Standard Error in the dataset is: " + result;
                        displayLabel.setText(display);
                        break;
                    case "Z-Score":
                        zScorePanel.setVisible(true);
                        break;
                    default:
                        break;
                }
            if (dropDown.getSelectedItem().toString().equals("Z-Score")) {
                display = "Please type a data point to be used";
                displayLabel.setText(display);
            }
            else {
                display = "The " + dropDown.getSelectedItem() + " in the dataset is " + result;
                displayLabel.setText(display);
                displayLabel.setForeground(Color.BLACK);
            }
            break;
            case "Calculate Z-Score":
                String point = zScoreText.getText();
                zScore zs = new zScore();
                try {
                    result = zs.getZScore(array, point);
                    display = "The Z-Score for the selected point is: " + result;
                    displayLabel.setText(display);
                }
                catch(Exception notNumber) {
                    displayLabel.setText("Please enter a valid data point");
            }
            default:
                display = ("NOT SUPPORTED");
                break;
        }
    }
}