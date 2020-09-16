package dispatcher;

import java.util.HashMap;
import java.util.HashSet;

import exceptions.DuplicateTopicException;
import exceptions.NoSuchTopicException;
import observer.Observer;

public class Dispatcher {
    private HashMap<String, HashSet<Observer>> subscribers = new HashMap<>();
    private static Dispatcher instance = null;

    public void addTopic(String topic) throws DuplicateTopicException {
        if (subscribers.containsKey(topic)) {
            throw new DuplicateTopicException(topic);
        } else {
            subscribers.put(topic, new HashSet<Observer>());
            System.out.println("Topic (" + topic + ") added.");
        }
    }

    public static Dispatcher getInstance() {
        if (instance == null) {
            instance = new Dispatcher();
        }
        return instance;
    }

    private Dispatcher() {
    }

    public void sendMessage(String message, String topic) throws NoSuchTopicException {
        if(subscribers.containsKey(topic)) {
            System.out.println("Message ("+message+") is being sent to subscribers of "+topic);
            for(Observer o: subscribers.get(topic)) {
                o.update(message, topic);
            }
        } else {
            throw new NoSuchTopicException(topic);
        }
    }

    public void subscribe(Observer o, String topic) throws NoSuchTopicException {
        if(subscribers.containsKey(topic)) {
            subscribers.get(topic).add(o);
            System.out.println(o.getID()+" subscribed to "+topic);
        } else {
            throw new NoSuchTopicException(topic);
        }
    }

    public void unsubscribe(Observer o, String topic) throws NoSuchTopicException {
        if(subscribers.containsKey(topic)) {
            subscribers.get(topic).remove(o);
            System.out.println(o.getID()+" unsubscribed from "+topic);
        } else {
            throw new NoSuchTopicException(topic);
        }
    }
}