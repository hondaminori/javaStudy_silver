package Kyokasho.chap4.Mondai4_11;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[]{1, 2};
        for (int i = 0; i < 2; i++) {
            array[0][i] = i + 1;
        }
        for ( int ar[] : array ) {
            for (int a : ar) 
                System.out.print(a);
            System.out.print("_");
        }
    }
}
