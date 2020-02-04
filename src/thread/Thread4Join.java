package thread;

// t.join() causes the current thread to pause execution until t's thread terminates
public class Thread4Join {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread1());
        t1.start();
        t2.start();
        t1.join();


        System.out.println("t1 doit attendre t2");

    }

    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 11; i++) {
                    System.out.println("thread 1 :"+i);
                    Thread.sleep(4000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread2 implements Runnable {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 11; i++) {
                    System.out.println("thread 2 :"+i);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
