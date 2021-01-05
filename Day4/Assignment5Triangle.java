package Day4;
import java.util.Scanner;

public class Assignment5Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        double b = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();

        double area = (b * h)/2;
        double peri = 2 * ( b + h );

        System.out.println("Area of triangle is" + area );
        System.out.println("Perimeter of a triangle is : + peri");



    }
}
