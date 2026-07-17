package Kyokasho.chap4.Sample05;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.print(i);
        }
    }
}

// forに型推論を適用できる
// for (var a = 0; a < 5; a++) }

// 初期化式と更新式に複数の式を記述
// for (int i = 0, j = 0; i < 2 && j < 2; i++, j++)

// 初期化式に複数の型宣言を入れるとエラー（１つまで）
// for ( int i = 0, int j = 0; i < 2 && j < 2; i++, j++)
