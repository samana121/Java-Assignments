package AssignmentsFrom12;
import java.util.Scanner;

public class a22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = input.nextInt();

        for ( int i = 1; i <= 10; i++) {
            System.out.println(num + "*" +  i + "=" + num*i );

        }
    }
}
