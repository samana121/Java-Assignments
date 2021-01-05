package AssignmentsFrom12;
import javax.swing.*;

public class a14 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        if (a == b) {
            JOptionPane.showMessageDialog(null, "a is equal to b");
        } if (a > b) {
            JOptionPane.showMessageDialog(null, "a is greater than b");
        } if (a < b) {
            JOptionPane.showMessageDialog(null, "b is greater than a");
        }
    }

    }
