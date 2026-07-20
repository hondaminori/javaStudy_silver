package Kyokasho.chap6.Sample6_01;

class Main {
    public static void main(String[] args) {
        Clothes c = new Clothes();
        c.printItem();        // スーパークラスのメソッドにアクセス
        c.printClothes();     // サブクラスのメソッドにアクセス
    }
}