import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input distance in meters: ");
    double distance = in.nextDouble();
    System.out.print("Input hour: ");
    double hour = in.nextDouble();
    System.out.print("Input minutes: ");
    double minutes = in.nextDouble();
    System.out.print("Input seconds: ");
    double seconds = in.nextDouble();

    double speedMetersSecond = distance / ((hour * 60 + minutes) * 60 + seconds);
    double speedKMHour = distance / 1000 / (hour + (minutes + seconds / 60) / 60);
    double speedMilesHour = distance / 1609 / (hour + (minutes + seconds / 60) / 60);
    System.out.println("Your speed in meters/second is " + speedMetersSecond);
    System.out.println("Your speed in km/h is " + speedKMHour);
    System.out.println("Your speed in miles/h is " + speedMilesHour);
  }
}