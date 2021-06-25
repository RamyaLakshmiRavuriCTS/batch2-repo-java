public class RunnableExample implements Runnable {

    @Override
    public void run() {
        Lock();
    }

    void Lock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (RunnableExample.class) {
            System.out.println("In block " + Thread.currentThread().getName());
            System.out.println("In block " + Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {

        RunnableExample runnable1 = new RunnableExample();
        Thread thread1 = new Thread(runnable1);
        thread1.setName("Thread1");

        thread1.start();
        RunnableExample runnable2 = new RunnableExample();
        Thread thread2 = new Thread(runnable2);
        thread2.setName("Thread2");

        thread2.start();
        RunnableExample runnable3 = new RunnableExample();
        Thread thread3 = new Thread(runnable3);
        thread3.setName("Thread3");

        thread3.start();
    }
}