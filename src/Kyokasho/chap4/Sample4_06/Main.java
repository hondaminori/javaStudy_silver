package Kyokasho.chap4.Sample4_06;

public class Main {
    public static void main(String[] args) {
        // 初期化式にvarを使用
        for (var a = 0; a < 5; a++)
            System.out.print(a);
        System.out.println("\n----");

        // for文に入る前にカウンタ変数を宣言
        int b;
        for (b = 5; b > 0; b--)
            System.out.print(b);
//        int b = 0;
//        for (b; b > 0; b--)
//            System.out.print(b);
        System.out.println("\n----");

        // 初期化式、更新式を複数指定
        for (int i = 0, j = 0; i < 2 && j < 2; i++, j++) {
            System.out.println("i:" + i + " J:" + j);
        }
//        for (int i = 0, int j = 0; i < 2 && j < 2; i++, j++){}
    }
}

