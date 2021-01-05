package AssignmentsFrom12;
import java.util.Scanner;

public class a26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number");
        int num = input.nextInt();
        int reversed = 0;
        while (  num != 0 ) {
            int digit = num % 10;
            num = num/10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("The reversed num is: " + reversed);


        }

    }
