package AssignmentsFrom12;
import java.util.Scanner;

public class a17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = input.nextInt();

        boolean isLeap = false;

        if ( year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;

            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

            if (isLeap == true)
                System.out.println( year + "is a lap year");
            else
                System.out.println( year + "is not a leap year");



    }
}
