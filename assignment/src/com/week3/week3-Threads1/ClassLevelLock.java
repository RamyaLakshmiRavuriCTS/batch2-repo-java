//main class
class ClassLevelLock implements Runnable {

    //run method
    public void run() {

        lock();
    }
    //lock method
    public void lock() {

        //System.out.println(Thread.currentThread().getName());
        synchronized (ClassLevelLock.class) {

            System.out.println(Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }
    //main method
    public static void main(String[] args) {

        ClassLevelLock lock1 = new ClassLevelLock();
        Thread t1 = new Thread(lock1);
        Thread t2 = new Thread(lock1);

        Thread t3 = new Thread(lock1);
        t1.setName("thread1");
        t1.start();
        t2.setName("thread2");
        t2.start();
        t3.setName("thread3");
        t3.start();
    }
}
