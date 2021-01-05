package AssignmentsFrom12;

import java.util.Scanner;

public class a24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        int total = 1;

        for (int i = 1; i <= num; i++) {
            total = total * i;
        }
        System.out.println("Factorial of the given num is: " + total );


    }
}
