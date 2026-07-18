package Kyokasho.chap4.Mondai4_05;

public class Main {
    public static void main(String[] args) {
        // デバッグ用
        args = new String[3];
        args[0] = "10";
        args[1] = "20";
        args[2] = "30";

        int v = 0, w = 0;
        for(String s : args) {
            v += ++w + Integer.parseInt(s);
        }
        System.out.println(v);
    }
}
