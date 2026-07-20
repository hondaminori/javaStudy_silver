package Kyokasho.chap6.Sample6_02;

class Test extends Base {
    @Override
    public void methodA() {
        super.methodA(); // オーバーライド元のメソッドにアクセス
        methodB();       // オーバーライドと関係の無いスーパークラスのメソッドにアクセス
    }
    public static void main(String[] args) {
        new Test().methodA();
    }
}
