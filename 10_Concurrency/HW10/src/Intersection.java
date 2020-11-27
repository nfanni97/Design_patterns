import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Intersection extends Thread {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
    private boolean isLightGreen = true;
    private boolean isCarInIntersection = false;
    public ReentrantLock intersectionLock = new ReentrantLock();
    public Condition greenLightCV = intersectionLock.newCondition();
    public Condition carLeftIntersectionCV = intersectionLock.newCondition();

    private String getTimeStamp() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return sdf.format(ts);
    }

    public Intersection() {
        start();
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(Double.valueOf(2.5*1000).longValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            intersectionLock.lock();
            isLightGreen = !isLightGreen;
            if(isLightGreen) {
                greenLightCV.signalAll();
            }
            System.out.println(getTimeStamp()+" - light turned "+((isLightGreen) ? "green" : "red")+".");
            intersectionLock.unlock();
        }
    }

    public boolean isLightGreen() {
        return isLightGreen;
    }

    public void setLightGreen(boolean isLightGreen) {
        this.isLightGreen = isLightGreen;
    }

    public boolean isCarInIntersection() {
        return isCarInIntersection;
    }

    public void setCarInIntersection(boolean isCarInIntersection) {
        this.isCarInIntersection = isCarInIntersection;
    }

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        for(int i=0;i<10;i++) {
            new Car(i, intersection);
        }
    }
    
}