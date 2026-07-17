package Kyokasho.chap4.Mondai4_13;

public class Main {
    public static void main(String[] args) {
        String text = "Hello";
        int index = 1;
        while (index < text.length()) {
            switch (text.charAt(index)) {
                case 'H':
                    System.out.print(0);
                case 'e':
                    System.out.print(1);
                    break;
                case 'l':
                    System.out.print(2);
                    index++;
                    continue;
                case 'o':
                    System.out.print(3);
            }
            index++;
        }
    }
}
