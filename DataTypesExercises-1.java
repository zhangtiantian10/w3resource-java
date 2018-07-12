import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a degree in Fahrenheit: ");
    double f = input.nextDouble();
    
    double c = (( 5 *(f - 32.0)) / 9.0);
    
    System.out.println(f + " degree Fahrenheit is equal to " + c + " in Celsius");
 }
}