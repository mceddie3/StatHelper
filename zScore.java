import java.util.Scanner;

public class zScore extends Array {
    private double zScore;
    private String input;
    public double getZScore(double mean, double sd) {
        System.out.println("For what data point would you like to calculate the Z-Score for? ");
        input = scnr.nextLine();
        if (input.equals("quit")){
            System.out.println("Thank you for using Stat Helper");
            System.exit(0);
        }
        zScore = (Integer.parseInt(input) - mean)/sd;
        return zScore;
    }
    public String toString() {
        return "The Z-Score for the input: " + input + " is: " + zScore;
    }
}
