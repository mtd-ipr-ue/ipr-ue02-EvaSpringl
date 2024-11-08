import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int year;
            int month;

            // User input for year, ensure year is not negative
            while (true) {
                System.out.println("Please enter the year:");
                year = scanner.nextInt();

                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Error: year cannot be negative. Please try again.");
                }
            }

            // User input for month, ensure value for month is between 1 and 12
            while (true) {
                System.out.println("Please enter a value for the month between 1 and 12:");
                month = scanner.nextInt();

                if (month >= 1 && month <= 12) {
                    break;
                } else {
                    System.out.println("Error: month must be between 1 and 12. Please try again!");
                }
            }

            // calculate days in the chosen month
            int days = daysInMonth(month, year);

            if (days == 0) {
                System.out.println("Invalid month!");
            } else {
                System.out.println("The Month " + month + " in the year " + year + " has " + days + " days.");
            }
        }
    }

    public static int daysInMonth(int month, int year) {
        int days;
        switch (month) {
            case 1: // january
            case 3: // march
            case 5: // may
            case 7: // july
            case 8: // august
            case 10: // october
            case 12: // december
                days = 31;
                break;
            case 4: // april
            case 6: // june
            case 9: // september
            case 11: // november
                days = 30;
                break;
            case 2: // february
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // leap year
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0; // invalid month
                break;
        }
        return days;
    }
}