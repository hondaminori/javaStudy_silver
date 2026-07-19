package Kyokasho.chap5.Sample5_11;

public class Item {
    private int id;
    private String name;
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void printItem() {
        System.out.println("Item id:" + id + " name:" + name );
    }
    public static void main(String[] args) {
        Item item = new Item(100, "T-shirt"); // コンストラクタ呼び出し1
        item.printItem();
        new Item(200, "Jacket").printItem();  // コンストラクタ呼び出し2
    }
}
