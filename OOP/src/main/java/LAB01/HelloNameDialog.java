package LAB01; // Defines the package in which this class resides

import javax.swing.JOptionPane; // Imports the JOptionPane class from javax.swing package for user input and output

public class HelloNameDialog { // Declares a public class named HelloNameDialog
    public static void main(String[] args) { // The main method where the program starts
        String name = JOptionPane.showInputDialog(null, "What is your name?"); // Displays a dialog box asking the user for their name and stores the input in a variable

        String message = "Hello, " + name + "!"; // Constructs a greeting message using the user's name

        JOptionPane.showMessageDialog(null, message); // Displays a dialog box with the greeting message
    }
}
