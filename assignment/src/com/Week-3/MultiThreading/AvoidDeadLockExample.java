package Multithreading;

/*This class avoids dead lock situation in multi threading
 * DeadLock means when two Threads are run concurrently
 * the resources of one Thread is shared by another Thread
 * when resource of Thread one is Locked while waiting resource of secondThread
 * and secondThread also waiting for Thread one resource at that point of time
 * Those two Thread will never execute.That ia called DeadLock*/
public class AvoidDeadLockExample {
    /*Main method*/
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        java.lang.Thread thread1 = new java.lang.Thread(new ThreadSynchronization(object1, object2), "thread1");
        java.lang.Thread thread2 = new java.lang.Thread(new ThreadSynchronization(object2, object3), "thread2");
        thread1.start();
        try {
            java.lang.Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            java.lang.Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
