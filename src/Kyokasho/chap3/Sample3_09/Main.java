package Kyokasho.chap3.Sample3_09;

public class Main {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println("arr == null : " + (arr == null)); // true
        arr = new int[3];
        System.out.println("arr != null : " + (arr != null)); // true
    }
}
