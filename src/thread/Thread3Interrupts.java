package thread;
// An interrupt is an indication to a thread that it should stop what it is doing and do something els
public class Thread3Interrupts {
    static long startTime = System.currentTimeMillis();
    static long patience = 12000;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExampleWithInterruptedExeption());
        t.start();
        while ((System.currentTimeMillis() - startTime) < patience) {
        }
        t.interrupt();
        /**
         * What if a thread goes a long time without invoking a method that throws InterruptedException?
         * Then it must periodically invoke Thread.interrupted, which returns true if an interrupt has been received
         */
        Thread t2 = new Thread(new ThreadExampleWithoutInterruptedExeption());

        if(!t2.isInterrupted()){
            System.out.println("thread not yet interrupted");
        }

        t2.interrupt();

        if(t2.isInterrupted()){
            System.out.println("thread  interrupted");
        }
    }

    public static class ThreadExampleWithInterruptedExeption implements Runnable {

        @Override
        public void run() {
            try {
                for (int i = 0; i < 11; i++) {
                    System.out.println(i);
                    Thread.sleep(4000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("thread interupted");
            }
        }
    }

    public static class ThreadExampleWithoutInterruptedExeption implements Runnable {

        @Override
        public void run() {
            while (true) {
            }

        }
    }
}
