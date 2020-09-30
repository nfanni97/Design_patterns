package subject;

public class WashingMachine extends Subject {
    public void finished(double load) {
        sendNotification(id+" washing machine finished, come pick up your stuff", "announcement");
        sendNotification(id+" washing machine used up "+load+"W in this cycle", "data");
    }

}
