package exceptions;

public class DuplicateTopicException extends Exception {
    private String topic;

    public DuplicateTopicException(String topic) {
        super("This topic ("+topic+") already exists");
        this.topic = topic;
    }
}
