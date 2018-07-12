import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int a = 100000;
        for(int i = 0; i < 6; i ++) {
            int output = input / a;
            if(i < 5) {
                System.out.print(output + " ");
            } else {
                System.out.println(output);
            }
            input -= (output * a);
            a = a / 10;
        }
    }
}