package Jishu.Kyokasho.chap6.Sample26;

public class Main {
    public static void main(String[] args) {
        Shape obj = new Square();
        test(obj);
        testSmart(obj);
    }
    static void test(Object obj) {
        if(obj instanceof Cube) {
            Cube c = (Cube)obj;
            System.out.println(c.calcVolume());
        } else if (obj instanceof Square) {
            Square s = (Square)obj;
            System.out.println(s.calcArea() + " sq cm");
        }
    }
    static void testSmart(Object obj) {
        if (obj instanceof Cube c) {
            System.out.println(c.calcVolume());
        } else if (obj instanceof Square s) {
            System.out.println(s.calcArea() + "sq cm");
        }
    }
}
