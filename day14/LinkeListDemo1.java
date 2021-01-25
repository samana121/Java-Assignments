package day14;

import java.util.LinkedList;
import java.util.List;

public class LinkeListDemo1 {

        public static void main(String[] args) {
            List<Integer> li = new LinkedList<>();
            li.add(10);
            li.add(20);
            li.add(30);
            System.out.println(li);
            li.add( 1, 15 );
            System.out.println(li);
            li.set(3,25);
            System.out.println(li);
            System.out.println(li.get(2));
            System.out.println(li.size());
            //li.clear();
            System.out.println(li);
            System.out.println(li.isEmpty());
            System.out.println(li.contains(30));
            System.out.println(li.indexOf(2));
            System.out.println(li.remove(1));
            System.out.println(li);

            List<Integer>li2 = new LinkedList<>();
            li2.add(50);
            li2.addAll(li);
            System.out.println(li2);
            li2.addAll( 0, li);
            System.out.println(li2);
            li2.removeAll(li);
            System.out.println(li2);
            li2.retainAll(li);
            System.out.println(li2);



        }
}
