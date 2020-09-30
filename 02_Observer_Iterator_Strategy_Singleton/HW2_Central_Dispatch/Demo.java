import dispatcher.Dispatcher;
import exceptions.DuplicateTopicException;
import exceptions.NoSuchTopicException;
import observer.Database;
import observer.Enthusiast;
import subject.Lamp;
import subject.SolarPanel;
import subject.WashingMachine;

public class Demo {
    public static void main(String[] args) {
        try {
            Dispatcher.getInstance().addTopic("maintenance");
            Dispatcher.getInstance().addTopic("data");
            Dispatcher.getInstance().addTopic("announcement");

            Lamp kitchen = new Lamp();
            SolarPanel p1 = new SolarPanel();
            SolarPanel p2 = new SolarPanel();
            WashingMachine wm = new WashingMachine();

            Database db = new Database();
            Enthusiast e = new Enthusiast();

            kitchen.powerOut();
            Dispatcher.getInstance().subscribe(e, "data");
            wm.finished(15);
            p1.breakDown("too much sun exposure");
            Dispatcher.getInstance().unsubscribe(db, "announcement");
            Dispatcher.getInstance().subscribe(e, "science");
        } catch (NoSuchTopicException e1) {
            System.err.println(e1.getMessage());
        } catch (DuplicateTopicException e1) {
            System.err.println(e1.getMessage());
        }
    }
}
