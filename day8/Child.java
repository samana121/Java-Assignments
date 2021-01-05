package day8;

public class Child extends Parent{

    public Child () {
        System.out.println("this is a child's constructor");
    }

    String name = "this is a child";

    public void sayHello() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("hello from child");
        super.sayHello();
    }

}
