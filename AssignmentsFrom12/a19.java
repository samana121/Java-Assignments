package AssignmentsFrom12;
import java.util.Scanner;

public class a19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = input.nextInt();
        System.out.println("Enter the second side");
        int b = input.nextInt();
        System.out.println("Enter the third side");
        int c = input.nextInt();

        if ( a == b && b == c) {
            System.out.println("The triangle is equilateral");
            if  (a == b || b == c || c == a )
                System.out.println("The triangle is isosceles");
        else
                System.out.println("The triangle is scalene");
        }
    }

}
