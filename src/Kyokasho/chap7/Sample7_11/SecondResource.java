package Kyokasho.chap7.Sample7_11;

public class SecondResource implements AutoCloseable {
    @Override public void close() {
        System.out.println("SecondResource#close()");
    }
}
