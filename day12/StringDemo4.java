package day12;

public class StringDemo4 {
    public static void main(String[] args) {
        String line = "Hello, My name is Samana, I am from Nepal, I am learning Java";
        String [] words = line.split( ",");
        for (String w: words) {
            System.out.println(w);
        }

        String s = "hello";
        if (s.matches("[H|h]ello")) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
