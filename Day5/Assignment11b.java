package Day5;
import java.util.Scanner;

public class Assignment11b {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();

        System.out.println("Before swapping a and b: " + a + b);

        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swapping a and b is : " + a + " " + b);
    }
    }
