package Mondai.Chapter7.Mondai03;

public class A implements AutoCloseable {
    private String name;
    public A(String name) {
        this.name = name;
    }
    public void close() throws Exception {
        System.out.println(name);
    }
}
