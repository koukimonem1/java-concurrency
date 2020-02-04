package thread.synchronization;

public class Thread6SynchronizedMethods {

    public static void main(String[] args) {

    }

    /**
     * Key word synchronized :
     */
    // When one thread is executing a synchronized method for an object, all other threads that invoke synchronized methods for the same object block (suspend execution) until the first thread is done with the object.
    // Second, when a synchronized method exits, it automatically establishes a happens-before relationship with any subsequent invocation of a synchronized method for the same object.
    // This guarantees that changes to the state of the object are visible to all threads.
    /**  a thread cannot acquire a lock owned by another thread**/
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
