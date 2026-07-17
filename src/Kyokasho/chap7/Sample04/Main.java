package Kyokasho.chap7.Sample04;

public class Main {
    public static void main(String[] args) {
        // デバッグ用
        args = new String[]{"10", "20", "30"};

        for (int i = 0; i < 3; i++) {
            System.out.println("*** LOOP " + (i + 1) + " ***");
            try {
                System.out.println(" try - " + args[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" catch - " + e.getMessage());
            } finally {
                System.out.println(" finally");
            }
        }
    }
}
