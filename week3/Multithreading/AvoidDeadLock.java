public class AvoidDeadLock
{
    public static void main(String[] args) throws InterruptedException
    {
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();

        Thread thread1 = new Thread(new SynchronizeThread(object1, object2), "thread1");
        Thread thread2 = new Thread(new SynchronizeThread(object2, object3), "thread2");

        thread1.start();

        Thread.sleep(2000);


        thread2.start();

        Thread.sleep(2000);
    }
    }
        class SynchronizeThread implements Runnable {
            private Object object1;
            private Object object2;

            public SynchronizeThread(Object o1, Object o2)
            {
                this.object1 = o1;
                this.object2 = o2;
            }

            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " acquire lock on ");

                synchronized (object1) {
                    System.out.println(name + " acquired lock on ");
                    work();
                }
                System.out.println(name + " released lock of ");
                System.out.println(name + " acquire lock on ");
                synchronized (object2) {
                    System.out.println(name + " acquire lock on ");
                    work();
                }
                System.out.println(name + " released lock of ");
                System.out.println(name + " execution is completed.");
            }

            private void work() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }



