package Kyokasho.chap3.Sample3_20;

public class Main {
    public static void main(String[] args) {
      String s = "A";
      // String s = "";
        switch (s) {
            case "A", "B" -> System.out.println("A-B");
            case "C", "D" -> System.out.println("C-D");
            case "E", "F" -> { System.out.println("E-F"); break; }
            // case "G":
            default -> throw new RuntimeException("N/A");
        }
    }
}
