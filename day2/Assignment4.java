package day2;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        float P = input.nextInt();
        System.out.println("Enter Rate: ");
        float R = input.nextInt();
        System.out.println("Enter Time: ");
        float T =  input.nextInt();

        float SI = ((P*T*R)/100);

        System.out.println("Simple Interest is " + SI);



    }

}
