
package multithreadingpractice.producerconsumer;

public class Driver {
    
    public static void executeProducerConsumer() throws InterruptedException
    {
       Producer_Consumer pc = new Producer_Consumer();

       Thread producerThread[] = new Thread[2];
       Thread consumerThread[] = new Thread[2];

         for(int i=0;i<producerThread.length;i++)
         {
              producerThread[i] = new Thread(() -> {
                try {
                     for(int j=0;j<20;j++)
                     {
                          pc.produce();
                     }
                } catch (InterruptedException e) {
                     e.printStackTrace();
                }
              },"Producer Thread "+(i+1));
         }
         for(int i=0;i<consumerThread.length;i++)
         {
              consumerThread[i] = new Thread(() -> {
                try {
                     for(int j=0;j<20;j++)
                     {
                          pc.consume();
                     }
                } catch (InterruptedException e) {
                     e.printStackTrace();
                }
              },"Consumer Thread "+(i+1));
         }

         for(int i=0;i<producerThread.length;i++)
         {
              producerThread[i].start();
              
         }
         for(int i=0;i<consumerThread.length;i++)
         {
              consumerThread[i].start();
         }

         for(int i=0;i<producerThread.length;i++)
         {
              producerThread[i].join();
              consumerThread[i].join();
         }

         System.out.println("Producer-Consumer execution completed--> Final Queue Size: "+pc.getQueue().size() +" and data in queue: "+pc.getQueue());
    }
}
