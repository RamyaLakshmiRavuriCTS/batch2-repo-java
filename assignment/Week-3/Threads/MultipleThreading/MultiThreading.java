public class MultiThreading implements Runnable {
    public void run() {
        Lock();
    }
    public static synchronized void Lock()
    {
        System.out.println(
                Thread.currentThread().getName());
        synchronized (MultiThreading.class)
        {
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName());
            System.out.println(
                    "in block "
                            + Thread.currentThread().getName()
                            + " end");
        }
    }
    public static void main(String[] args)
    {
        MultiThreading g1 = new MultiThreading();
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g1);
        MultiThreading g2 = new MultiThreading();
        Thread t3 = new Thread(g2);
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        t1.start();
        t2.start();
        t3.start();

    }
}