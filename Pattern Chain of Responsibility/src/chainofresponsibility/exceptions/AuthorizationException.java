package chainofresponsibility.exceptions;

public class AuthorizationException extends RuntimeException {
    public AuthorizationException (String message) {
        super("AuthorizationException: " + message);
    }
}
