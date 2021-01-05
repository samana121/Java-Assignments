package Day5;
import java.util.Scanner;

public class Assignment10a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial velocity: ");
        double u = input.nextDouble();
        System.out.println("Enter acceleration : ");
        double a = input.nextDouble();
        System.out.println("Enter the time travelled: ");
        double t = input.nextDouble();

        double dist = u * t + 0.5 * a * t * t ;
        System.out.println("The total distance travelled is " + dist );



    }
}
