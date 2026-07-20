package Kyokasho.chap6.Sample6_13;

public class Main {
    public static void main(String[] args) {
        // Testインタフェースの定数にアクセス
        System.out.println("Test.EXCELLENT: " + Test.EXCELLENT); // インタフェース名.定数名
        // Sampleクラスのmethod()の動作確認
        new Sample().method();
    }
}
