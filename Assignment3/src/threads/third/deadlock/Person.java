package src.threads.third.deadlock;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void sayHello(Person person) {
        System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
        person.sayHelloBack(this);
    }

    public synchronized void sayHelloBack(Person person) {
        System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
    }
}
