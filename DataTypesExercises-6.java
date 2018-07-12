import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input weight in pounds: ");
    int weight = in.nextInt();
    System.out.print("Input height in inches: ");
    int height = in.nextInt();

    double bodyMass = weight * 0.4535924 / Math.pow(height * 0.0254, 2);
    System.out.printf("Min integer: " + bodyMass);
  }
}