package Kyokasho.chap4.Mondai4_14;

public class Main {
    public static void main(String[] args) {
        String[][] letters = {{"A ", "B ", "C ", "D "}
                                ,{"E ", "F ", "G ", "H "}};
        for (String[] letter : letters) {
            // C
            for (String l : letter) {
                System.out.print(l);
            }
            // // D
            // for (int i = 0; i < letter.length; i++) {
            //     System.out.print(letter[i]);
            // }
        }
    }
}
