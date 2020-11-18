import java.util.Random;

public class Consumer extends Thread {
    private static int nextId = 0;
    private int id;
    private Tasks taskQueue;
    private static Random r = new Random();

    public Consumer(Tasks qs) {
        taskQueue = qs;
        id = nextId++;
        start();
    }

    @Override
    public void run() {
        while (true) {
            taskQueue.queueLock.lock();
            while (taskQueue.queue.isEmpty()) {
                try {
                    taskQueue.queueNotEmptyCV.await();
                } catch (InterruptedException e) {
                }
            }
            Object myObject = taskQueue.queue.poll();
            System.out.println("consumer #" + id + " took something out of the queue");
            taskQueue.queueNotFullCV.signalAll();
            taskQueue.queueLock.unlock();
            try {
                sleep(Double.valueOf((r.nextDouble() / 2 + 0.5) * 1000).longValue());
            } catch (InterruptedException e) {
            }
        }
    }
}
