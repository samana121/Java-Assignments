package Day10;

public class MethodDemo1 {
    //access Modifier > void < method name > (o to any num of args) {
    //===
    // }
    //method declaration
    public void sayHello () {
        System.out.println("Hello");
        System.out.println("Good Morning");
    }

    public void displayInfo(String name, int age) {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

    public static void main(String[] args) {
        MethodDemo1 obj = new MethodDemo1();
        //method calling
        obj.sayHello();
        obj.displayInfo( "ram", 22);
    }


}
