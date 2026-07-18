package Kyokasho.chap4.Sample4_08;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Coconut"};

        // varを使用
        for (var v : fruits)
            System.out.print(v + " ");
        System.out.println("\n----");

        // 要素への逆順アクセス
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println("\n----");

        // 1文字を取得
        for (String fruit : fruits) {
            System.out.print(fruit.charAt(0));
        }
/*
        // コンパイルエラー(配列と異なるデータ型の変数宣言)
        for (char c : fruits) {
            System.out.print(c);
        }

        // コンパイルエラー(変数の初期化を行おうとする例)
        for (String fruit = "" : fruits){
            System.out.println(fruit + " ");
        }
*/
    }
}

