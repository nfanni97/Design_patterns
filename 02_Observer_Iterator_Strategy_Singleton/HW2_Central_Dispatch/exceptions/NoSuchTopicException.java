package exceptions;

public class NoSuchTopicException extends Exception {
    private String topic;

    public NoSuchTopicException(String topic) {
        super("This topic ("+topic+") does not exist! Try adding it");
        this.topic = topic;
    }
}
