package LAB01; // Defines the package in which this class resides

import java.util.Scanner; // Imports the Scanner class from java.util package for user input

public class InputFromKeyboard { // Declares a public class named InputFromKeyboard
    public static void main(String[] args) { // The main method where the program starts
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for reading the input

        System.out.println("Please enter your name: "); // Prompts the user to enter their name
        String name = scanner.nextLine(); // Reads the name from the user

        System.out.println("Please enter your age: "); // Prompts the user to enter their age
        int age = scanner.nextInt(); // Reads the age from the user

        System.out.println("Please enter your weight in kg: "); // Prompts the user to enter their weight
        double weight = scanner.nextDouble(); // Reads the weight from the user

        System.out.println("Name: " + name); // Prints out the name
        System.out.println("Age: " + age); // Prints out the age
        System.out.println("Weight: " + weight + " kg"); // Prints out the weight

        scanner.close(); // Closes the scanner object and releases any system resources associated with it
    }
}
