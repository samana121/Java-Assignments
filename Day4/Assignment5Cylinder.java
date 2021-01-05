package Day4;
import java.util.Scanner;
//Area and volume of cylinder

public class Assignment5Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base radius of cylinder:");
        double ba =  input.nextDouble();
        System.out.println("Enter height of the cylinder:");
        double he = input.nextDouble();

        double Area = 2 * Math.PI * ba * ( ba + he);
        double Volume = Math.PI * ba * ba * he;

        System.out.println("Area of cylinder is: " + Area);
        System.out.println("Volume of cylinder is : " + Volume);





    }

}
