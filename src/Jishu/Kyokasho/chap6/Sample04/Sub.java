package Jishu.Kyokasho.chap6.Sample04;

public class Sub extends Super {
    double x = 1.0;
    static double y = 2.0;
    /* static */ void instMethod() {
        System.out.println("Sub#instMethod()");
    }
    static void statMethod() {
        System.out.println("Sub#statMethod()");
    }
}
