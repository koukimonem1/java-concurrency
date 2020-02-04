package thread;
public class Thread2Sleep {

    // This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system
    //  This is an exception that sleep throws when another thread interrupts the current thread while sleep is active
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            Thread.sleep(4000);
        }

    }

}
