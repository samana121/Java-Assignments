package Day5;
import java.util.Scanner;

public class Assignment11a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();

        System.out.println("Before swapping a and b: " + a + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a and b is : " + a + " " + b);


    }

}
