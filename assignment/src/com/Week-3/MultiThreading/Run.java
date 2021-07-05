package Multithreading;

/*This class implements Runnable interface works on multi threading concepts*/
public class Run implements Runnable {
    @Override
    public void run() {
        Lock();
    }

    void Lock() {
        synchronized (Run.class) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName() + " end");
        }
    }

    /*Main method
     *Performing multi threading*/
    public static void main(String[] args) {
        Run runnable1 = new Run();
        Thread thread1 = new Thread(runnable1);
        thread1.setName("Thread1");
        thread1.start();
        Run runnable2 = new Run();
        Thread thread2 = new Thread(runnable2);
        thread2.setName("Thread2");
        thread2.start();
        Run runnable3 = new Run();
        Thread thread3 = new Thread(runnable3);
        thread3.setName("Thread3");
        thread3.start();

    }
}
