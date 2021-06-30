package MultiThreading;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        Lock();
    }

    void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (Runnable1.class) {
            System.out.println("In block " + Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        Runnable1 runnable1 = new Runnable1();
        Thread thread1 = new Thread(runnable1);
        thread1.setName("Thread1");
        thread1.start();
        Runnable1 runnable2 = new Runnable1();
        Thread thread2 = new Thread(runnable2);
        thread2.setName("Thread2");
        thread2.start();
        Runnable1 runnable3 = new Runnable1();
        Thread thread3 = new Thread(runnable3);
        thread3.setName("Thread3");
        thread3.start();

    }
}

