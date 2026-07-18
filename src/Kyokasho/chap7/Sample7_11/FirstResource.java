package Kyokasho.chap7.Sample7_11;

public class FirstResource implements AutoCloseable {
    @Override public void close() {
        System.out.println("FirstResource#close()");
    }
}
