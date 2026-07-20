package Kyokasho.chap6.Sample6_13;

class Sample implements Test {
    @Override public void foo() {}
    @Override public int bar() { return 0;}
    @Override public boolean baz() { return false;}
    public void method() {
        // Testインタフェースの定数にアクセス
        System.out.println("VERY_GOOD:" + VERY_GOOD);           // 実装クラスでは定数名のみも可
    }
}
