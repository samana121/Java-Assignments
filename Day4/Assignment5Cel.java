package Day4;
import java.util.Scanner;

public class Assignment5Cel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fah = input.nextDouble();

        double celsius = (( 5 * (fah - 32)) / 9.0);

        System.out.println(fah + "degree fahrenheit is equal to " + celsius + "celsius ");

    }

}
