package observer;

import dispatcher.Dispatcher;
import exceptions.NoSuchTopicException;

public class Enthusiast extends Observer {
    public Enthusiast() {
        try {
            Dispatcher.getInstance().subscribe(this, "announcement");
        } catch (NoSuchTopicException e) {
            System.out.println(e.getMessage());
        }
    }
}
