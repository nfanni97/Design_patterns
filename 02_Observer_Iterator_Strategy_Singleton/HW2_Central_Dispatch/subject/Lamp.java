package subject;

public class Lamp extends Subject {
    public void powerOut() {
        sendNotification(id+" lamp is out, switch it!", "maintenance");
    }
}
