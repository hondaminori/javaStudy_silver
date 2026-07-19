package Kyokasho.chap5.Sample5_06;

class Item {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        // オブジェクトの生成(インスタンス化)
        Item item = new Item();
        // itemのメンバにアクセス
        item.setName("T-shirt");
        System.out.println("item : " + item.getName());
        // private指定されたメンバへのアクセス
        // item.name = "Sweater";
        // System.out.println("item : " + item.name);
    }
}
