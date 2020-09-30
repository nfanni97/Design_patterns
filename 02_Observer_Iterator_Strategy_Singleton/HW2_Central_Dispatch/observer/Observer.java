package observer;

import java.util.ArrayList;

public abstract class Observer {
    private int id;
    private static int count = 0;

    public Observer() {
        id = count++;
    }

    public Observer(ArrayList<String> s) {
        id = count++;
    }

    public int getID() {
        return id;
    }

    public void update(String message, String topic) {
        System.out.println(id+" got the message: "+message+" in topic "+topic);
    }
}
