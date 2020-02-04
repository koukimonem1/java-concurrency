package thread.synchronization;

//enforcing exclusive access to an object's state and establishing happens-before relationships that are essential to visibility
//TODO
//see https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
public class Thread7IntrinsicLocksAndSynchronization {

    public static void main(String[] args) {

    }



    //  Instead of using synchronized methods or otherwise using the lock associated with this, we create two objects solely to provide locks
    public static class MsLunch {
        private long c1 = 0;
        private long c2 = 0;
        private Object lock1 = new Object();
        private Object lock2 = new Object();

        public void inc1() {
            synchronized(lock1) {
                c1++;
            }
        }

        public void inc2() {
            synchronized(lock2) {
                c2++;
            }
        }
    }
}
