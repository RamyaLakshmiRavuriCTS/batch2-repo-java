package monday.june14.threads.first;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new ClassLevelLock();
        thread1.setName("thread1");
        thread1.start();

        Thread thread2 = new ClassLevelLock();
        thread2.setName("thread2");
        thread2.start();

        Thread thread3 = new ClassLevelLock();
        thread3.setName("thread3");
        thread3.start();

    }
}
