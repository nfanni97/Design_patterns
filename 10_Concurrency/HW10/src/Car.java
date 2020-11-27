import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Car extends Thread {
    // TODO: car only locks until it goes into intersection (so that light can
    // change when it's in there as well)
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
    private int id;
    private Intersection intersection;

    private String getTimeStamp() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return sdf.format(ts);
    }

    public Car(int i, Intersection is) {
        id = i;
        intersection = is;
        start();
    }

    @Override
    public void run() {
        System.out.println(getTimeStamp() + " - car " + id + " approaches intersection.");
        try {
            sleep(Double.valueOf(3 * 1000).longValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getTimeStamp() + " - car " + id + " arrived to the intersection.");
        intersection.intersectionLock.lock();
        //wait for empty intersection
        while(intersection.isCarInIntersection()) {
            try{
                intersection.carLeftIntersectionCV.await();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        //wait for green
        intersection.setCarInIntersection(true);
        while (!intersection.isLightGreen()) {
            try {
                intersection.greenLightCV.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        intersection.intersectionLock.unlock();
        System.out.println(getTimeStamp() + " - car " + id + " went into the intersection.");
        try {
            sleep(Double.valueOf(1 * 1000).longValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intersection.intersectionLock.lock();
        intersection.setCarInIntersection(false);
        intersection.carLeftIntersectionCV.signalAll();
        intersection.intersectionLock.unlock();
        System.out.println(getTimeStamp() + " - car " + id + " left the intersection.");
        try {
            sleep(Double.valueOf(3 * 1000).longValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getTimeStamp()+" - car "+id+" died.");
    }
}
