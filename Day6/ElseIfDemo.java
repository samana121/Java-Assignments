package Day6;

public class ElseIfDemo {

    public static void main(String[] args) {
        int marks = 45;
        if(marks >= 80 && marks <= 100){
            System.out.println("Distinction");
        }else if (marks >=60 && marks <= 79){
            System.out.println("First");
        }
        else if (marks >=40 && marks<= 59) {
            System.out.println("Second");
        }else {
            System.out.println("Fail");

        }
        System.out.println("exit");

    }
}
