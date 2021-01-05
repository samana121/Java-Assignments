package Day6;

public class NestedIfELseDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        if(a>b) {
            if (a > c) {
                System.out.println("a is largest one.");
            } else {
                System.out.println("c is largest one ");
            }
        } else {
            System.out.println("a is smaller than b but may be smaller than c");

        }
    }
}
