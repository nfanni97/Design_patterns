import java.util.Deque;
import java.util.Random;

public class Producer extends Thread {
    private static int nextId = 0;
    private int id;
    private Tasks taskQueue;
    private static Random r = new Random();

    public Producer(Tasks tq) {
        taskQueue = tq;
        id = nextId++;
        start();
    }

    @Override
    public void run() {
        while (true) {
            taskQueue.queueLock.lock();
            while (taskQueue.queue.size() == Tasks.MAX_SIZE) {
                try {
                    taskQueue.queueNotFullCV.await();
                } catch (InterruptedException e) {
                }
            }
            Object myObject = new Object();
            taskQueue.queue.add(myObject);
            System.out.println("producer #" + id + " put something in the queue");
            taskQueue.queueNotEmptyCV.signalAll();
            taskQueue.queueLock.unlock();
            try {
                sleep(Double.valueOf((r.nextDouble() / 2 + 0.5) * 1000).longValue());
            } catch (InterruptedException e) {
            }
        }
    }

}
