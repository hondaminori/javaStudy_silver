package Kyokasho.chap5.Sample5_08;

class Item {
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void printItem() {
        System.out.println("Item : " + name);
    }
    public void printItem(String mark) {
        System.out.print(mark);
        System.out.print(" Item : " + name);
        System.out.println(" " + mark);
    }
    public void printItem(String mark, int num) {
        String line = "";
        for (int i = 0; i < num; i++) {
            line += mark;
        }
        printItem(line);        // this.printItem(line)
    }
}
public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.setName("T-shirt");
        item.printItem();
        item.printItem("*");
        item.printItem("#", 3);
    }
}
