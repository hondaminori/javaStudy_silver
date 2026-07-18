package Kyokasho.chap7.Mondai7_11;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable{
    String name;
    public Resource(String name) {
        this.name = name;
    }
    public void close() throws IOException {
        System.out.print(name + ":close()");
        throw new IOException();
    }
}
