import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a value for inch: ");
    double inch = input.nextDouble();
    
    double meter = inch * 0.0254;
    
    System.out.println(inch + " inch is " + meter + " meters");
 }
}