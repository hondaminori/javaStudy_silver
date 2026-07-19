package Kyokasho.chap3.Sample3_19;

public class Main {
    public static void main(String[] args) {
        String s = "A";
        switch (s) {
            case "A":
                case "B":
                System.out.println("A, B");
                // break;
            default:
                System.out.println("Other");
        }
        System.out.println("-------------");

        String z = "Z";
        switch (z) {
            default:
                System.out.println("Other");
            case "B":
                System.out.println("B");
            case "A":
                System.out.println("A");
        }
        System.out.println("-------------");

        // String n = null;
        // switch (n) {
        //     // case null:
        //     case "A":
        //         System.out.println("A");
        //     case "B":
        //         System.out.println("B");
        //     // case "B":
        // }
    }
}
