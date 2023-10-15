package LAB01;

import java.util.Scanner;

public class DayInMonths {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String[] shortMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            while (true) {
                System.out.println("Enter a month: ");
                String monthInput = scanner.nextLine().trim();

                System.out.println("Enter a year: ");
                String yearInput = scanner.nextLine().trim();

                int month = -1;
                for (int i = 0; i < months.length; i++) {
                    if (monthInput.equalsIgnoreCase(months[i]) || monthInput.equalsIgnoreCase(shortMonths[i]) || monthInput.equals(String.valueOf(i + 1))) {
                        month = i;
                        break;
                    }
                }

                int year = -1;
                if (yearInput.matches("\\d+") && yearInput.length() >= 1) {
                    year = Integer.parseInt(yearInput);
                }

                if (month != -1 && year != -1) {
                    if (month == 1 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                        System.out.println(months[month] + " " + year + " has 29 days\n\n");
                    } else {
                        System.out.println(months[month] + " " + year + " has " + daysInMonth[month] + " days\n\n");
                    }
                    break;
                } else {
                    System.out.println("Invalid input. Please enter again.\n\n");
                }
            }
        }
//        scanner.close();
    }
}
