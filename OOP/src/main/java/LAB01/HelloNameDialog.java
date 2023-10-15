package LAB01;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String message = "Hello, " + name + "!";
        JOptionPane.showMessageDialog(null, message);
    }
}
