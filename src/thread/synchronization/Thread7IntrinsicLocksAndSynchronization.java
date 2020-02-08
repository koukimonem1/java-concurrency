package thread.synchronization;

import java.util.ArrayList;
import java.util.List;

//enforcing exclusive access to an object's state and establishing happens-before relationships that are essential to visibility
//Synchronization is built around an internal entity known as the intrinsic lock or monitor lock. (The API specification often refers to this entity simply as a "monitor.")
//Intrinsic locks play a role in both aspects of synchronization: enforcing exclusive access to an object's state and establishing happens-before relationships that are essential to visibility.
//Every object has an intrinsic lock associated with it
//A thread is said to own the intrinsic lock between the time it has acquired the lock and released the lock
//As long as a thread owns an intrinsic lock, no other thread can acquire the same lock. The other thread will block when it attempts to acquire the lock.
// When a thread releases an intrinsic lock, a happens-before relationship is established between that action and any subsequent acquisition of the same lock.
//see https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
public class Thread7IntrinsicLocksAndSynchronization {

    public static void main(String[] args) {

    }



    //  Instead of using synchronized methods or otherwise using the lock associated with this, we create two objects solely to provide locks
    public static class MsLunch {
        private String lastName;
        private int nameCount;
        List<String> nameList= new ArrayList<>();
        private long c1 = 0;
        private long c2 = 0;
        private Object lock1 = new Object();
        private Object lock2 = new Object();

        public void addName(String name) {
            // Attetion !!! : Unlike synchronized methods, synchronized statements must specify the object that provides the intrinsic lock
            synchronized(this) {
                lastName = name;
                nameCount++;
            }
            nameList.add(name);
        }
//c1 and c2, that are never used together. All updates of these fields must be synchronized, but there's no reason to prevent an update of c1 from being interleaved with an update of c2 —
// and doing so reduces concurrency by creating unnecessary blocking. Instead of using synchronized methods or otherwise using the lock associated with this, we create two objects solely to provide locks.
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
