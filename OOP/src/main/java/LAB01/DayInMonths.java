package LAB01; // Defines the package in which this class resides

import java.util.Scanner; // Imports the Scanner class from java.util package for user input

public class DayInMonths { // Declares a public class named DayInMonths
    public static void main(String[] args) { // The main method where the program starts
        while(true) { // An infinite loop that keeps asking the user for input
            Scanner scanner = new Scanner(System.in); // Creates a Scanner object for reading the input

            // Arrays to store the names of months, short names of months, and number of days in each month
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String[] shortMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            while (true) { // An inner loop that keeps asking the user for a valid month and year
                System.out.println("Enter a month: "); // Prompts the user to enter a month
                String monthInput = scanner.nextLine().trim(); // Reads the month from the user

                System.out.println("Enter a year: "); // Prompts the user to enter a year
                String yearInput = scanner.nextLine().trim(); // Reads the year from the user

                int month = -1; // Initializes a variable to store the index of the month in the array
                for (int i = 0; i < months.length; i++) { // Loops through each month in the array
                    if (monthInput.equalsIgnoreCase(months[i]) || monthInput.equalsIgnoreCase(shortMonths[i]) || monthInput.equals(String.valueOf(i + 1))) {
                        month = i; // If the input matches a month, stores its index
                        break;
                    }
                }

                int year = -1; // Initializes a variable to store the year
                if (yearInput.matches("\\d+") && yearInput.length() >= 1) { // Checks if the input is a valid year
                    year = Integer.parseInt(yearInput); // Converts the year from String to int
                }

                if (month != -1 && year != -1) { // If both month and year are valid
                    if (month == 1 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                        System.out.println(months[month] + " " + year + " has 29 days\n\n"); // If it's February in a leap year, prints out that it has 29 days
                    } else {
                        System.out.println(months[month] + " " + year + " has " + daysInMonth[month] + " days\n\n"); // Otherwise, prints out how many days it has
                    }
                    break; // Breaks out of the inner loop
                } else {
                    System.out.println("Invalid input. Please enter again.\n\n"); // If either month or year is invalid, asks for input again
                }
            }
        }
//        scanner.close(); // Closes the scanner object and releases any system resources associated with it. This line is commented out because it's inside an infinite loop.
    }
}
