import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // User input for year
            System.out.println("Please enter the year:");
            int year = scanner.nextInt();
            // User input for month
            System.out.println("Please enter a value for the month between 1 and 12:");
            int month = scanner.nextInt();
            // User input for days
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