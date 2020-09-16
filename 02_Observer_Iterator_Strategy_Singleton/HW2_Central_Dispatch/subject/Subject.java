package subject;

import dispatcher.Dispatcher;
import exceptions.NoSuchTopicException;

public abstract class Subject {
    protected int id;
    private static int count = 0;

    public Subject() {
        id = count++;
    }

    protected void sendNotification(String message, String topic) {
        try {
            Dispatcher.getInstance().sendMessage(message, topic);
        } catch(NoSuchTopicException e) {
            System.err.println(e.getMessage());
        }
    }
}
