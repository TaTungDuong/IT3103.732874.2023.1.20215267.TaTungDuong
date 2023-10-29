package LAB01; // Defines the package in which this class resides

import javax.swing.JOptionPane; // Imports the JOptionPane class from javax.swing package for user input and output

public class CalculateDoubleNumbers { // Declares a public class named CalculateDoubleNumbers
    public static void main(String[] agrs) { // The main method where the program starts
        // Ask the user to input two numbers
        String num1 = JOptionPane.showInputDialog(null, "Enter the first number:"); // Prompts the user to enter the first number
        String num2 = JOptionPane.showInputDialog(null, "Enter the second number:"); // Prompts the user to enter the second number
        
        double n1 = Double.parseDouble(num1); // Converts the first number from String to double
        double n2 = Double.parseDouble(num2); // Converts the second number from String to double
        
        String message = ""; // Initializes a variable to store the message that will be shown to the user
        message += n1 + " + " + n2 + " = " + String.format("%.3f", n1+n2) + "\n"; // Adds the result of addition to the message
        message += n1 + " - " + n2 + " = " + String.format("%.3f", n1-n2) + "\n"; // Adds the result of subtraction to the message
        message += n1 + " x " + n2 + " = " + String.format("%.3f", n1*n2) + "\n"; // Adds the result of multiplication to the message
        message += n1 + " / " + n2 + " = " + String.format("%.3f", n1/n2) + "\n"; // Adds the result of division to the message
        
        JOptionPane.showMessageDialog(null, message); // Shows a dialog box with the message
    }
}
