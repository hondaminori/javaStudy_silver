package Kyokasho.chap7.Sample11;

public class SecondResource implements AutoCloseable {
    @Override public void close() {
        System.out.println("SecondResource#close()");
    }
}
