import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input the side length value: ");
    double length = in.nextDouble();

    double square = Math.pow(length, 2);
    double cube = Math.pow(length, 3);
    double fourth = Math.pow(length, 4);

    System.out.printf("Square: %.2f\n", square);
    System.out.printf("Cube: %.2f\n", cube);
    System.out.printf("Fourth power: %.2f", fourth);
  }
}