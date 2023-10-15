package LAB01;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size n
        double[] array = new double[n];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Calculate the sum
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Calculate the average
        double average = sum / n;
        System.out.println("Average: " + average);

        scanner.close();
    }
}

