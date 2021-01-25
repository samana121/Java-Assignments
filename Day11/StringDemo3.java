package Day11;

import java.util.Locale;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "Good Morning";
        System.out.println(s1);
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0, 4));
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("d"));
        char [] ch = s1.toCharArray();
        System.out.println(ch[0]);
        System.out.println(s1.contains("M"));
        System.out.println("Hello. ".concat(s1));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String s2 = " Samana Timalsena";
        System.out.println(s2);
        System.out.println(s2.trim());

    }
}
