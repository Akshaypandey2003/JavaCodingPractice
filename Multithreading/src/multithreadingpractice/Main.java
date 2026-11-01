package multithreadingpractice;

import multithreadingpractice.producerconsumer.Driver;

public class Main {
    
    public static void sharedCountTask() throws InterruptedException
    {
      System.out.println("Incrementing the counter---->");
      SharedCounter counter = new SharedCounter();

        Thread[] threads = new Thread[4];

        for (int i = 0; i < threads.length; i++) 
        {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    counter.increment();
                }
            });
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Final count :"+counter.atomicCount.get());
    }
    public static void main(String [] args) throws InterruptedException{
    
        // sharedCountTask();

        Driver.executeProducerConsumer();
    }
}
