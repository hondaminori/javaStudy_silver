package Kyokasho.chap4.Sample07;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println("\n----");
        for (int i = 0; i < array.length; i++) {
            int e = array[i];
            System.out.print(e + " ");
        }
    }
}

// 型推論を利用可能
// for (var v : fruits) { }

// 要素に逆順にアクセス
// for (int i = fruits.length -1; i >= 0; i--) { }

// 型が異なるとエラー
// for (char c : fruits) { }
//   ※fruitsは文字列変数、char は文字型とした場合