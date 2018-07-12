import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int numberOne = in.nextInt();
        System.out.print("Input 2st integer: ");
        int numberTwo = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", numberOne + numberTwo);
        System.out.printf("Difference of two integers: %d%n", numberOne - numberTwo);
        System.out.printf("Product of two integers: %d%n", numberOne * numberTwo);
        System.out.printf("Average of two integers: %.2f%n", (double) (numberOne + numberTwo) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(numberOne - numberTwo));
        System.out.printf("Max integer: %d%n", Math.max(numberOne, numberTwo));
        System.out.printf("Min integer: %d%n", Math.min(numberOne, numberTwo));
    }
}