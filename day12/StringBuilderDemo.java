package day12;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);
        s1.concat(" Good Morning");
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Good");
        System.out.println(sb);
        sb.append(" Evening");
        System.out.println(sb);

        StringBuffer sbb = new StringBuffer("Good");
        System.out.println(sbb);
        sbb.append(" Evening");
        System.out.println(sbb);


    }
}
