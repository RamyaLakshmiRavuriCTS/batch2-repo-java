package Multithreading;

/*This class implements Runnable interface*/
public class ThreadSynchronization implements Runnable {
    private Object object1;
    private Object object2;

    public ThreadSynchronization (Object o1, Object o2) {
        this.object1 = o1;
        this.object2 = o2;
    }

    @Override
    public void run() {
        String name = java.lang.Thread.currentThread().getName();
        System.out.println(name + " acquire lock on " + object1);
        synchronized (object1) {
            System.out.println(name + " acquired lock on " + object1);
            try {
                java.lang.Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " released lock of " + object1);
        System.out.println(name + " acquire lock on " + object2);
        synchronized (object2) {
            System.out.println(name + " acquire lock on " + object2);
            try {
                java.lang.Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " released lock of " + object2);
        System.out.println(name + " execution is completed.");
    }

}
