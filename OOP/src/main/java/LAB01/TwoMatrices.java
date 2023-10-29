package LAB01; // Defines the package in which this class resides

import java.util.Scanner; // Imports the Scanner class from java.util package for user input

public class TwoMatrices { // Declares a public class named TwoMatrices
    public static void main(String[] args) { // The main method where the program starts
        Scanner input = new Scanner(System.in); // Creates a Scanner object for reading the input

        System.out.println("Enter the size of the matrices:"); // Prompts the user to enter the size of the matrices
        int n = input.nextInt(); // Reads the size from the user

        int[][] matrix1 = new int[n][n]; // Creates a 2D array to store the first matrix
        int[][] matrix2 = new int[n][n]; // Creates a 2D array to store the second matrix
        int[][] sum = new int[n][n]; // Creates a 2D array to store the sum of the two matrices

        System.out.println("Enter elements of first matrix:"); // Prompts the user to enter elements of the first matrix
        for (int i = 0; i < n; i++) { // Loops through each row of the first matrix
            for (int j = 0; j < n; j++) { // Loops through each column of the first matrix
                matrix1[i][j] = input.nextInt(); // Reads each element from the user and stores it in the first matrix
            }
        }

        System.out.println("Enter elements of second matrix:"); // Prompts the user to enter elements of the second matrix
        for (int i = 0; i < n; i++) { // Loops through each row of the second matrix
            for (int j = 0; j < n; j++) { // Loops through each column of the second matrix
                matrix2[i][j] = input.nextInt(); // Reads each element from the user and stores it in the second matrix
            }
        }

        for (int i = 0; i < n; i++) { // Loops through each row of the matrices
            for (int j = 0; j < n; j++) { // Loops through each column of the matrices
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; // Adds corresponding elements of the two matrices and stores it in sum
            }
        }

        System.out.println("Sum of the matrices is:"); // Prints out a message indicating that it's going to print out the sum of matrices
        for (int i = 0; i < n; i++) { // Loops through each row of sum
            for (int j = 0; j < n; j++) { // Loops through each column of sum
                System.out.print(sum[i][j] + " "); // Prints out each element in sum followed by a space
            }
            System.out.println(); // Moves to a new line after printing out a row in sum
        }
    }
}
