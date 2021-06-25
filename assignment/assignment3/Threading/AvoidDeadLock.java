public class AvoidDeadLock {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        java.lang.Thread thread1 = new java.lang.Thread(new ThreadSynchronizedExample(object1, object2), "thread1");
        java.lang.Thread thread2 = new java.lang.Thread(new ThreadSynchronizedExample(object2, object3), "thread2");
        
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
