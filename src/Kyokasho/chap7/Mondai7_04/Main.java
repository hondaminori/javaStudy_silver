package Kyokasho.chap7.Mondai7_04;

public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("exception");
        }
    }
}
