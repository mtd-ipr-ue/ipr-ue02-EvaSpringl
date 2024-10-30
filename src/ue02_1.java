import java.util.Scanner;

public class ue02_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // User input of the three numbers
            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();

            // loop to determine the biggest number
            int maxValue = number1;

            if (number2 > maxValue) {
                maxValue = number2;
            }
            if (number3 > maxValue) {
                maxValue = number3;
            }
            // output of the biggest number
            System.out.println("The biggest number is: " + maxValue);
        }

    }
}