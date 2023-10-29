package LAB01; // Defines the package in which this class resides

import java.util.Arrays; // Imports the Arrays class from java.util package for array manipulation
import java.util.Scanner; // Imports the Scanner class from java.util package for user input

public class Array { // Declares a public class named Array
    public static void main(String[] args) { // The main method where the program starts
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for reading the input

        System.out.println("Enter the number of elements in the array: "); // Prompts the user to enter the number of elements in the array
        int n = scanner.nextInt(); // Reads the number of elements from the user

        double[] array = new double[n]; // Creates an array of size n

        System.out.println("Enter the elements of the array: "); // Prompts the user to enter the elements of the array
        for (int i = 0; i < n; i++) { // Loops through each element in the array
            array[i] = scanner.nextDouble(); // Reads each element from the user
        }

        Arrays.sort(array); // Sorts the array in ascending order
        System.out.println("Sorted array: " + Arrays.toString(array)); // Prints out the sorted array

        double sum = 0; // Initializes a variable to store the sum of elements in the array
        for (double i : array) { // Loops through each element in the array
            sum += i; // Adds each element to the sum
        }
        System.out.println("Sum: " + sum); // Prints out the sum of elements in the array

        double average = sum / n; // Calculates and stores the average of elements in the array
        System.out.println("Average: " + average); // Prints out the average of elements in the array

        scanner.close(); // Closes the scanner object and releases any system resources associated with it
    }
}
