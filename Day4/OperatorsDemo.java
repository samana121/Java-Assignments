package Day4;

public class OperatorsDemo {
    public static void main(String[] args) {
        // arithmetic operators + - / % *
        // priority: + - (low) /% * (high)
        //Left to to right

        int a = 4 + 5 - 7 % 2 -7 / 2+2 * 3;
        System.out.println(a);

        // assignment operator = += -= *= %=
        //right to left

        int i = 6;
        System.out.println(i);
        i += 3; //i = i+3;
        System.out.println(i);
    }
}
