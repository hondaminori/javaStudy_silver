package Kyokasho.chap4.Sample09;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i < 10) {
                System.out.print("  " + i);
            } else {
                System.out.print(" " + i);
            }
            if ( i % 5 == 0) {
                String s = " ...";
                System.out.println(s);
            }
            // System.out.println(s);
        }
    }
}
