package exceptions;

public class NotSupportedOperationException extends Exception {
    public NotSupportedOperationException(String cause) {
        super("This operation is not supported, because "+cause+".");
    }
}
