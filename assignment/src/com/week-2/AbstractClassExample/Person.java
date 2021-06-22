/* Person is abstract class
 *  Because it contains two unimplemented methods(role,responsibilities)*/
public abstract class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /* Methods which doesn't have method body
     *   is called abstract methods*/
    public abstract void role();

    public abstract void responsibilities();
}
