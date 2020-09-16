package subject;

public class SolarPanel extends Subject {

    public void produceEnergy(int amount) {
        sendNotification(id+" solar panel generated "+amount +" watt yay", "data");
    }

    public void breakDown(String how) {
        sendNotification(id+" panel broke down: "+how, "maintenance");
    }

    public void reachedGoal() {
        sendNotification(id+" solar panel generated its daily goal!", "announcement");
    }
}
