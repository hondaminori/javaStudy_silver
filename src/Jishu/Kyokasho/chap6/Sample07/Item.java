package Jishu.Kyokasho.chap6.Sample07;

public class Item {
    private int id;
    Item(int id) {
        this.id = id;
    }
    public void display() {
        System.out.println("Item id:" + id);
    }
}
