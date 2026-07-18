package Kyokasho.chap7.Mondai7_12;

public class Main {
    public static void main(String[] args) {
        try {
            new Main().x(null);
        } catch (RuntimeException e) {}
    }

    public void x(String s) throws NullPointerException {
        if (s == null) {
            throw new NullPointerException();
        } else {
            throw new RuntimeException();
        }
    }
}
