package day17;

public class ThreadingDemo1 extends Thread {

    @Override
    public void run () {
        System.out.println("Hello from Thread");

    }
    public static void main(String[] args) {
        ThreadingDemo1 t1 = new ThreadingDemo1();
                t1.start();

    }

}
