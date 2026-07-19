package Kyokasho.chap5.Sample5_13;

public class Sample {
    int value = 100;                          // インスタンス変数
    static int commonValue = 500;             // static変数
    // インスタンスメソッド
    public void printValue() {
        System.out.println("instance value : " + value);
    }
    // staticメソッド
    public static void printCommonValue() {
        System.out.println("static common value : " + commonValue);
    }
}
