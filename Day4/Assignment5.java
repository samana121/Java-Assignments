package Day4;
//Area of rectangle
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        double l = input.nextDouble();
        System.out.println("Enter breadth: ");
        double b = input.nextDouble();
        System.out.println("Enter height: ");
        double h = input.nextDouble();

        double area = l * b * h;
        double peri = 2 * (l + b);

        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + peri);


    }
}
