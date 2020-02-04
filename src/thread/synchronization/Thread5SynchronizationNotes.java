package thread.synchronization;

public class Thread5SynchronizationNotes {
    /**
     * Thread Interference
     */
    // Interference happens when two operations, running in different threads, but acting on the same data, interleave.
    // This means that the two operations consist of multiple steps, and the sequences of steps overlap.
    // See the example in : https://docs.oracle.com/javase/tutorial/essential/concurrency/interfere.html
    /**
     * Memory Consistency Errors
     */
    // Memory consistency errors occur when different threads have inconsistent views of what should be the same data
    // In multithreading, there can be possibilities that the changes made by one thread might not be visible to the other threads and they all have inconsistent views of the same shared data.
    // This is known as memory consistency error.
    //  happens-before relationship. This relationship guarantees that memory writes operation performed by one thread is visible to a read operation by any other thread on the same shared memory
    // See this example : https://www.geeksforgeeks.org/thread-interference-and-memory-consistency-errors-in-java/
    // See also : https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html
}
