package LAB01; // Defines the package in which this class resides

import javax.swing.JOptionPane; // Imports the JOptionPane class from javax.swing package for user input and output

public class ChoosingOption { // Declares a public class named ChoosingOption
    public static void main(String[] agrs) { // The main method where the program starts
        Object[] options = {"Yes", "No"}; // Creates an array of options for the user to choose from

        // Displays a dialog box with a question and two options (Yes and No) for the user to choose from
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?", // The question to be asked
                "Choose an option", // The title of the dialog box
                JOptionPane.YES_NO_OPTION, // The type of options
                JOptionPane.QUESTION_MESSAGE, // The type of message to be displayed
                null, // No icon is used
                options, // The array of options
                options[0]); // The initial value for the dialog box

        // Displays a dialog box with a message showing what option the user has chosen
        JOptionPane.showMessageDialog(null, "You have chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

        System.exit(0); // Terminates the program
    }
}
