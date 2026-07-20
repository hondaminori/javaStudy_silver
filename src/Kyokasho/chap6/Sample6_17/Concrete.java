package Kyokasho.chap6.Sample6_17;

class Concrete implements Bar {
    public void y() {
        System.out.print("a call from Concrete#y()... ");
        Foo.statMethod();       // staticメソッドアクセス
//      Bar.statMethod();       // X：サブインタフェース名
    }
}
