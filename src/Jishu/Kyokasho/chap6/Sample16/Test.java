package Jishu.Kyokasho.chap6.Sample16;

public class Test implements Foo{
    @Override
    public void x() {
        System.out.println("Test#x()");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.x();
        t.y();
    }
}
