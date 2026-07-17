package Kyokasho.chap4.Mondai4_16;

public class Main {
    public static void main(String[] args) {
        String[][] str = {{"A", "B", "C"} ,{"D", "E", "F"}};
        outer:
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (i == 1) break outer;
                if (j == 2) continue outer;
                System.out.print(str[i][j]);
            }
        }
    }
}
