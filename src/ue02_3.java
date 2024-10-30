import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        // user input for x coordinate
        System.out.println("Please enter the x-coordinate of the point: ");
        double x = scanner.nextDouble();
        // user input for y coordinate
        System.out.println("Please enter the y-coordinate of your point: ");
        double y = scanner.nextDouble();

        boolean isInCircle = isInCircle(x, y, 4);

        if (isInCircle) {
            System.out.println("The point (" + x + ", " + y + ") is within the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is NOT within the circle.");
        }
        }
    }
    // checks if the point is in the circle
    public static boolean isInCircle(double x, double y, double radius) {
        double distanceToMiddle = Math.sqrt(x * x + y * y);
        return  distanceToMiddle <= radius;
    }
}
