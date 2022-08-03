package exceptions;

public class RailwayCarriageConstructionsExceptions extends RuntimeException{
    public RailwayCarriageConstructionsExceptions (String message) {
        super("Can not construct carriage: " + message);
    }
}
