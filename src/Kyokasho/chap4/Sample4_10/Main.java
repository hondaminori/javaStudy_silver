package Kyokasho.chap4.Sample4_10;

public class Main {
    public static void main(String[] args) {
        int[][] array = { { 1, 9 }, { 2, 8 }, { 3, 7 } };
        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.print(" ");
        }
        System.out.println("\n--------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
