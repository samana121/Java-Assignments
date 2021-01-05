package day2;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter second number: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;
        float avg = sum / 2;

        System.out.println("sum of " + n1 + " and " + n2 + " is: " + sum);
        System.out.println("Average of " + n1 + " and " + n2 + " is: " + avg);
    }


}
