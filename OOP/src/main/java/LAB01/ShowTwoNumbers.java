package LAB01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        // Ask the user to input two numbers
        String num1 = JOptionPane.showInputDialog(null, "Enter the first number:");
        String num2 = JOptionPane.showInputDialog(null, "Enter the second number:");

        // Create a message with the numbers
        String message = "You entered " + num1 + " and " + num2;

        // Show a message dialog with the numbers
        JOptionPane.showMessageDialog(null, message);
    }
}
