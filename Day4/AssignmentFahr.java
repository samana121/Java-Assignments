package Day4;
import java.util.Scanner;

public class AssignmentFahr {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter degree in Celsius");
        float cel = input.nextFloat();

        float fahr = cel * (9f / 5) + 32;

        System.out.println( cel + "degrees in celsius is" + fahr + "in fahrenheit");



    }
}
