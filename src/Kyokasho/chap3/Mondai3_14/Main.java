package Kyokasho.chap3.Mondai3_14;

public class Main {
    public static void main(String[] args) {
        String[] array = {"H", "e", "l", "l", "o"};
        String text = "";
        if (array[0] == "H") {
            text += array[0];
        }
        if (!(array[2] == "e")) {
            text += "e";
        } else if (array[4].equalsIgnoreCase("O")) {
            text += "o";
        } else {
            text += "!";
        }
        System.out.println(text);
    }
}
