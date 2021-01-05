package AssignmentsFrom12;
import java.util.Scanner;

public class a20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double n1 = input.nextDouble();
        System.out.println("Enter second number");
        double n2 = input.nextDouble();
        System.out.println("Enter an operator ( + , -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> result = n1 / n2;
            default -> {
                System.out.println("Wrong operator");
                return;
            }
        }
        System.out.println(n1 + " " + operator + " " + n2 + "=" + result  );
    }
}

