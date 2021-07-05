//interface
interface Sayable {
    // default method    
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);

    // static method
    static void sayLouder(String msg) {
        System.out.println(msg);
    }
}

public class DefaultMethods implements Sayable {

    public void sayMore(String msg) {     // implementing abstract method
        System.out.println(msg);
    }

    public void say() {
        System.out.println("Hello this is overriden defult method");
    }

    public static void sayLouder(String msg) {

        System.out.println("this is " + msg + " method");//You cannot override the static method of the interface; you can just access them using the name of the interface. If you try to override a static method of an interface by defining a similar method in the implementing interface, it will be considered as another (static) method of the class.
    }

    public static void main(String[] args) {

        DefaultMethods dm = new DefaultMethods();
        dm.say();                       // calling default method    
        dm.sayMore("Work is worship");      // calling abstract method    
        Sayable.sayLouder("Helloooo...");// calling static method //you can only call static using interface name
        DefaultMethods.sayLouder("over ridden static");
    }
}    