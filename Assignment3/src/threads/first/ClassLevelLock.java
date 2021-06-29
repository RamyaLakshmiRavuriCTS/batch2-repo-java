package monday.june14.threads.first;

public class ClassLevelLock extends Thread{

    @Override
    public void run() {

        synchronized (ClassLevelLock.class) {

            String threadName = currentThread().getName();

            System.out.println(threadName);
            System.out.println("in block " + threadName);
            System.out.println("in block " + threadName + " end");

        }
    }
}
