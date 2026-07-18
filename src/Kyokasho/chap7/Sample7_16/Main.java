package Kyokasho.chap7.Sample7_16;

public class Main {
    public static void main(String[] args) {
        
    }

public static void execute (int value) 
    throws ValueTooLargeException, ValueTooSmallException {
        try {
            if (value < 0) {
                throw new ValueTooSmallException("Too Small!");
            } else if (value > 100) {
                throw new ValueTooLargeException("Too Large!");
            } else {
                System.out.println("Valid!");
            }
        } catch (Exception e) {
            throw e;
        }

    }
}