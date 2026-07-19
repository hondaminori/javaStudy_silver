package Kyokasho.chap3.Mondai3_09;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java");
        sb1.append("Java");
        String s1 = "Java";
        String s2 = sb2.toString();
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(sb1));
    }
}
