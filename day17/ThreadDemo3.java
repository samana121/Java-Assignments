package day17;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        });
    }
}
