package ro.unibuc.lab6.streams;

public class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(Throwable cause) {
        super(cause);
    }
}
