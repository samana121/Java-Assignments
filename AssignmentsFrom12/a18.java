package AssignmentsFrom12;
import java.util.Scanner;

public class a18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();

        if (a > b && a > c) {
            System.out.println(a);

            if (b > a && b > c)
                System.out.println(b);

            else
                System.out.println(c);
        }
    }
}
