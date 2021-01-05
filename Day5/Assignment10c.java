package Day5;
import javax.swing.*;

public class Assignment10c {

    public static void main(String[] args) {

        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a: " ));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b: " ));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c: " ));

        double x = ( -b + Math.sqrt(b * b -4 * a * c)) / 2 * a;

        JOptionPane.showMessageDialog(  null,"x is: " + x);




    }
}
