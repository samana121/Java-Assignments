package day15;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap studentMap = new HashMap ();
        studentMap.put(100, "Garima Poudel");
        studentMap.put(101, "Swastik Poudel");
        studentMap.put(103, "gopal Poudel");
        studentMap.put(104, "hari Poudel");

        System.out.println(studentMap.get(101));
        System.out.println(studentMap.get(100));
        System.out.println(studentMap.get(104));
        System.out.println(studentMap.get(103));



    }
}
