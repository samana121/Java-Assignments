package Day6;
import javax.swing.*;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice:"));
        switch (choice) {
            case 1:
                System.out.println("addition");
            case 2:
                System.out.println("subtraction");
            case 3:
                System.out.println("multiplication");
            case 4:
                System.out.println("division");
                break;
            default:
                System.out.println("wrong choice!!!");
                break;
        }
        System.out.println("exit");

        }
    }
