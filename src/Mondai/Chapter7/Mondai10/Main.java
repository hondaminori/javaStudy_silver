package Mondai.Chapter7.Mondai10;

public class Main {
    public static void main(String[] args) {
        Object[] objects = {
            new A(),
            new B(),
            "C"
        };

        for (Object obj : objects) {
            test(obj);
        }
    }

    private static void test(Object obj) {
        if (obj instanceof A b) {
            b.execute();
        }
    }
}
