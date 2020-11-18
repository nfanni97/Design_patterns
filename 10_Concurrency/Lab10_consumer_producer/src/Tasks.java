import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tasks {
    public final static int MAX_SIZE = 10;
    public Deque<Object> queue = new LinkedList<>();
    public Lock queueLock = new ReentrantLock();
    public Condition queueNotEmptyCV = queueLock.newCondition();
    public Condition queueNotFullCV = queueLock.newCondition();

    public static void main(String[] args) {
        Tasks t = new Tasks();
        for(int i=0;i<5;i++) {
            new Consumer(t);
            new Producer(t);
        }
    }
}