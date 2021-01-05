package AssignmentsFrom12;
import java.util.Scanner;

public class a23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the nth value: ");
        int num = input.nextInt();
        int total = 0;

        for (int i = 1; i <= num; i++) {
            total = total + i;
        }
            System.out.println("Sum of the given n numbers is: " + total );


    }
}
