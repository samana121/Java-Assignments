package Day4;
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();
          double kilo = (pounds / 2.2);

        System.out.println(pounds + "in kilograms is" + kilo);

    }
}
