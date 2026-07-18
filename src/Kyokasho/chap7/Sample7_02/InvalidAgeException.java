package Kyokasho.chap7.Sample7_02;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {}
    public InvalidAgeException(String message) { super(message); }
    public InvalidAgeException(Throwable cause) { super(cause); }
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
