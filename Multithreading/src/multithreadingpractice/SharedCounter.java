package multithreadingpractice;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter
{
    // volatile is redundant here because we are using synchronized method to increment the count variable.
    public volatile int count = 0;
    
    // public synchronized void increment()
    // {
    //     this.count++;
    //     System.out.println(this.count);
    // }

    public AtomicInteger atomicCount = new AtomicInteger(0);

    public void increment()
    {
        atomicCount.incrementAndGet();
        System.out.println(this.atomicCount.get());
    }
}