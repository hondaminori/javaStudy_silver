package Kyokasho.chap7.Sample12;

public class ResourceSample implements AutoCloseable {
    @Override 
    public void close() throws Exception {
        System.out.println("close()");
        throw new Exception("Exception");
    }
}
