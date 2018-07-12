import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the number of minutes: ");
    int minutes = input.nextInt();
    int minutesInYear = 24 * 60 * 365;
    int years = minutes / minutesInYear;
    int days = (minutes % minutesInYear) / (24 * 60);
    
    System.out.println(minutes + " minutes is approximately " + years + " years and " + days +" days");
 }
}