class LevelLock implements Runnable {
    @Override
        public void run() {
            Lock();
        }

        public void Lock()
        {
            System.out.println(Thread.currentThread().getName());
            synchronized (LevelLock.class)
            {
                System.out.println("in block " + Thread.currentThread().getName());
                System.out.println("in block " + Thread.currentThread().getName() + " end");
            }
        }

        public static void main(String[] args)
        {
            LevelLock levellock1 = new LevelLock();
            Thread thread1 = new Thread(levellock1);
            thread1.setName("Thread1");
            thread1.start();

            LevelLock levellock2 = new LevelLock();
            Thread thread2 = new Thread(levellock2);
            thread2.setName("Thread2");
            thread2.start();

            LevelLock levellock3 = new LevelLock();
            Thread thread3 = new Thread(levellock3);
            thread3.setName("Thread3");
            thread3.start();

        }
    }


