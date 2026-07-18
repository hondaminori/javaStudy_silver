package Kyokasho.chap7.Mondai7_16;

public class Main {
    public static void main(String[] args) {
        try {
            FirstException ex;
            ex = new FirstException(new SecondException(new FirstException("First"))); // 選択肢E
            throw ex;
        } catch(FirstException ex) {}
    }
}
class FirstException extends RuntimeException {
    FirstException() {}
    FirstException(Throwable cause) { super(cause); }
    FirstException(String message) { super(message); }
}
class SecondException extends FirstException {
    SecondException(Throwable cause) { super(cause); }
}
