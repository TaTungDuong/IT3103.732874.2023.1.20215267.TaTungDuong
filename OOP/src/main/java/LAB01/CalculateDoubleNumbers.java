package LAB01;

import javax.swing.JOptionPane;

public class CalculateDoubleNumbers {
    public static void main(String[] agrs) {
        // Ask the user to input two numbers
        String num1 = JOptionPane.showInputDialog(null, "Enter the first number:");
        String num2 = JOptionPane.showInputDialog(null, "Enter the second number:");
        
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        
        String message = "";
        message += n1 + " + " + n2 + " = " + String.format("%.3f", n1+n2) + "\n";
        message += n1 + " - " + n2 + " = " + String.format("%.3f", n1-n2) + "\n";
        message += n1 + " x " + n2 + " = " + String.format("%.3f", n1*n2) + "\n";
        message += n1 + " / " + n2 + " = " + String.format("%.3f", n1/n2) + "\n";
        
        JOptionPane.showMessageDialog(null, message);
    }
}
