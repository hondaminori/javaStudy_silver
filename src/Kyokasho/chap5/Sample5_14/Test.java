package Kyokasho.chap5.Sample5_14;

class Test {
    static int num;
    String s;
    // static初期化子
    static {
        num = 100;
        System.out.println("static Initializer... num : " + num);
    }
    // インスタンス初期化子
    {
        this.s = "Test";
        System.out.println("Initializer... s : " + s);
    }
    // コンストラクタ
    public Test(String s) {
        this.s = s;
        System.out.println("Constructor... s : " + s);
    }
}
