package AssignmentsFrom12;
import javax.swing.*;

public class a16 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter any number: "));
        if (a % 2 == 0) {
            JOptionPane.showMessageDialog(null, "The given number is even");
        } else {
            JOptionPane.showMessageDialog(null, "The given number is odd");
        }
    }
}
