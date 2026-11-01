package multithreadingpractice.producerconsumer;

import java.util.*;

public class Producer_Consumer {

    private Queue<Integer> queue;
    private final int LIMIT = 10;

    public Producer_Consumer() {
        this.queue = new LinkedList<>();
    }

    public void produce() throws InterruptedException {
       

        synchronized (queue) {
            
            while (queue.size() == LIMIT) {
                queue.wait();
            }
            Random random = new Random();
            int value = random.nextInt(100);
            queue.offer(value);
            queue.notifyAll();
            System.out.println("Produced: " + value);
        }
    }

    public void consume() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty. Waiting for producer...");
                queue.wait();
            }
            int value = queue.poll();
            System.out.println("Consumed: " + value);
            queue.notifyAll();
        }
    }

    public Queue<Integer> getQueue() {
        return queue;
    }
}
