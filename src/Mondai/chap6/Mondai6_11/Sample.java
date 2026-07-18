package Mondai.chap6.Mondai6_11;

public class Sample {
    public static void hello(String name) throws SampleException {
        if (name == null) {
            throw new SampleException();
        }
        if("".equals(name)) {
            throw new TestException();
        }
        // do something
    }
}
