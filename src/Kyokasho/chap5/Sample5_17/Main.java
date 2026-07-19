package Kyokasho.chap5.Sample5_17;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("T-shirt");
        Item item2 = item1;
        item2.name = "Jeans";
        System.out.println("item1, item2 : "
                        + item1.name + ", " + item2.name);
        System.out.println("item1 == item2 : "
                        + (item1 == item2));
    }
}
