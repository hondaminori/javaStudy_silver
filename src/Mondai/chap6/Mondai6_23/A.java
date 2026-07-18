package Mondai.chap6.Mondai6_23;

public class A implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("A");
    }
}
