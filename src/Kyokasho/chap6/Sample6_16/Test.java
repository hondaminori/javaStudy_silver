package Kyokasho.chap6.Sample6_16;

class Test implements Foo {
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
