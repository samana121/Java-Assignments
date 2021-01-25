package Day10;

public class MethodDemo2 {


    public static int findSum() {
        int a = 5;
        int b = 6;
        int sum = a+b;
        return sum;

    }

    public static int findMax(int a, int b) {
        int max = 0;
        if(a>b) {
            max = a;
        }
        else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        int s = MethodDemo2.findSum();
        System.out.println("Sum is: " + s);

        int m = MethodDemo2.findMax ( 5 , 6);
        System.out.println("MAx number is :" + m);
    }
}
