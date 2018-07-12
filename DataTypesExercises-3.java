import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an integer between 0 and 1000: ");
    int digit = input.nextInt();
    int sum = 0;
    int number = digit;
    for(int a = 1000; a >= 1; a = a / 10){
      int n = number / a;
      number = number - n * a;
      sum = sum + n;
    }
    
    System.out.println("The sum of all digits in " + digit + " is " + sum);
 }
}