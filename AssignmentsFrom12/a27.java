package AssignmentsFrom12;
import java.util.Scanner;

public class a27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        int num = input.nextInt();
        int sum = 0;
        int n;
        int product = 0;
        while ( num != 0) {
            n = num % 10;
            sum = sum + n;
            num = num / 10;


        }
        System.out.println("Sum of digits:" + sum);
        System.out.println("Product of digits:" +product);


    }
}
