package LAB01;

import javax.swing.JOptionPane;

public class SolveEquations {
    public static void main(String[] args) {
        while(true) {
            String t1 = "The linear equation with one variable";
            String t2 = "The linear system with two variables";
            String t3 = "The second-degree equation with one variable";

            String[] choices = {"", t1, t2, t3};
            String input = (String) JOptionPane.showInputDialog(null, "Choose the type of equation",
            "Solve Equations", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

            if (input.equals(t1)) {// If user choose to solve the linear equation with one variable
                JOptionPane.showMessageDialog(null, "Solve a*x + b = 0\n");
                // Ask the user to input two numbers
                String num1 = JOptionPane.showInputDialog(null, "Enter a:", 
                        t1, 0);
                String num2 = JOptionPane.showInputDialog(null, "Enter b:", 
                        t1, 0);

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);

                String message = "";


                if (a == 0) {
                    if (b == 0) {
                        message = "Infinite solutions";
                    } else {
                        message = "No solution";
                    }
                } else{
                    message = "x = " + String.format("%.3f", -b/a);                
                }

                JOptionPane.showMessageDialog(null, message);
            } else if (input.equals(t3)) { // If user choose to solve the second-degree equation with one variable
                JOptionPane.showMessageDialog(null, "Solve a*x^2 + b*x + c = 0\n");
                // Ask the user to input 3 numbers
                String num1 = JOptionPane.showInputDialog(null, "Enter a:", 
                        t3, 0);
                String num2 = JOptionPane.showInputDialog(null, "Enter b:", 
                        t3, 0);
                String num3 = JOptionPane.showInputDialog(null, "Enter c:", 
                        t3, 0);

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                double c = Double.parseDouble(num3);

                String message = "";

                if (a == 0) {
                    if (b == 0) {
                        if (c == 0) {
                            message = "Infinite solutions";
                        } else {
                            message = "No solution";
                        }
                    } else{
                        message = "x = " + String.format("%.3f", -c/b);                
                    }
                } else {            
                    double d = b*b - 4*a*c;

                    if(d < 0) {
                        message = "No solution";
                    }
                    else if (d == 0) {  
                        message = "x = " + String.format("%.3f", (- b)/(2*a));
                    }
                    else {
                        message = message + "x1 = " + String.format("%.3f", (Math.sqrt(d) - b)/(2*a)) + "\n";
                        message = message + "x2 = " + String.format("%.3f", (-Math.sqrt(d) - b)/(2*a) + "\n") + "\n";
                    }
                }

                JOptionPane.showMessageDialog(null, message);
            }
            else if(input.equals(t2)) { // If user choose to solve the linear system with two variables
                JOptionPane.showMessageDialog(null, "Solve a*x + b*y = c & d*x + e*y = f\n");
                // Ask the user to input 6 numbers
                String num1 = JOptionPane.showInputDialog(null, "Enter a:", 
                        t2, 0);
                String num2 = JOptionPane.showInputDialog(null, "Enter b:", 
                        t2, 0);
                String num3 = JOptionPane.showInputDialog(null, "Enter c:", 
                        t2, 0);
                String num4 = JOptionPane.showInputDialog(null, "Enter d:", 
                        t2, 0);
                String num5 = JOptionPane.showInputDialog(null, "Enter e:", 
                        t2, 0);
                String num6 = JOptionPane.showInputDialog(null, "Enter f:", 
                        t2, 0);

                double a = Double.parseDouble(num1);
                double b = Double.parseDouble(num2);
                double c = Double.parseDouble(num3);
                double d = Double.parseDouble(num4);
                double e = Double.parseDouble(num5);
                double f = Double.parseDouble(num6);

                String message = "";
                
                //Calculate det value
                double det = a*e - b*d;
                if (det == 0) { // If det equals to 0
                    if (a*d - b*c == 0 && a*f - c*d == 0) {
                        message = "Infinite solutions";
                    } else {
                        message = "No solution";
                    }
                } else {
                    double x = (e*c - b*f) / det;
                    double y = (a*f - d*c) / det;

                    message = "x = " + String.format("%.3f", x) + "\ny = " + String.format("%.3f", y);
                }
            }
        }
    }
}
