package Day6;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        char choice = (javax.swing.JOptionPane.showInputDialog("Enter your choice")).charAt(0);
        switch (choice) {
            case '+' -> System.out.println("addition");
            case '-' -> System.out.println("subtraction");
            case '*' -> System.out.println("multiplication");
            case '/' -> System.out.println("division");
            default -> System.out.println("wrong choice!!!");
        }
        System.out.println("exit");

    }
}


