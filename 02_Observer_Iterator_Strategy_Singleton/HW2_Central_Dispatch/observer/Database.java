package observer;

import dispatcher.Dispatcher;
import exceptions.NoSuchTopicException;

public class Database extends Observer {
    public Database() {
        try {
            Dispatcher.getInstance().subscribe(this, "data");
        } catch (NoSuchTopicException e) {
            System.out.println(e.getMessage());
        }
    }
}
