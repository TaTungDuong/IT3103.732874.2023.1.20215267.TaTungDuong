package LAB01; // Defines the package in which this class resides

import java.util.Scanner; // Imports the Scanner class from java.util package for user input

public class StarTriangle { // Declares a public class named StarTriangle
    public static void main(String[] args) { // The main method where the program starts
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for reading the input

        System.out.println("Enter the height of the triangle: "); // Prompts the user to enter the height of the triangle
        int n = scanner.nextInt(); // Reads the height from the user

        for (int i = 0; i < n; i++) { // Loops through each row of the triangle
            for (int j = 0; j < n - i; j++) { // Prints out spaces to align the stars in a triangular shape
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) { // Prints out stars to form a row of the triangle
                System.out.print("*");
            }
            System.out.println(); // Moves to the next line after printing a row of stars
        }

        scanner.close(); // Closes the scanner object and releases any system resources associated with it
    }
}
