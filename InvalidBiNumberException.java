public class InvalidBiNumberException extends RuntimeException {

    public InvalidBiNumberException(String msg) {
        super(msg);
    }

    public InvalidBiNumberException(String msg, Throwable t) {
        super(msg, t);
    }
}
