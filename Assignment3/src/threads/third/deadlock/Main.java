package src.threads.third.deadlock;

public class Main {

    public static void main(String[] args) {

        Person geetha = new Person("Geetha");
        Person mamatha = new Person("Mamatha");

        Thread thread1 = new Thread(() -> {
            geetha.sayHello(mamatha);
        });

        thread1.start();
// to get dead-lock condition comment try catch block and execute
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            mamatha.sayHello(geetha);
        }).start();

    }
}
