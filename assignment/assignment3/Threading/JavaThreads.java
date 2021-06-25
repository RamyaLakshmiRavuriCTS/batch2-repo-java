public class JavaThreads implements Runnable {
    @Override
    public void run() {
        Lock();
    }

    void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (JavaThreads.class) {
            System.out.println("In block " + Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {

        JavaThreads runn = new JavaThreads();
        Thread thread1 = new Thread(runn);
        thread1.setName("Thread1 ");
        thread1.start();
        JavaThreads run2 = new JavaThreads();
        Thread thread2 = new Thread(run2);
        thread2.setName("Thread2");
        thread2.start();
        JavaThreads run3 = new JavaThreads();
        Thread thread3 = new Thread(run3);
        thread3.setName("Thread3");
        thread3.start();

    }
}
