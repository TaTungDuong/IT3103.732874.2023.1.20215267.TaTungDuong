package LAB01; // Defines the package in which this class resides

import javax.swing.JOptionPane; // Imports the JOptionPane class from javax.swing package for user input and output

public class ShowTwoNumbers { // Declares a public class named ShowTwoNumbers
    public static void main(String[] args) { // The main method where the program starts
        // Ask the user to input two numbers
        String num1 = JOptionPane.showInputDialog(null, "Enter the first number:"); // Displays a dialog box asking the user for the first number and stores the input in a variable
        String num2 = JOptionPane.showInputDialog(null, "Enter the second number:"); // Displays a dialog box asking the user for the second number and stores the input in a variable

        // Create a message with the numbers
        String message = "You entered " + num1 + " and " + num2; // Constructs a message using the two numbers entered by the user

        // Show a message dialog with the numbers
        JOptionPane.showMessageDialog(null, message); // Displays a dialog box with the message
    }
}
