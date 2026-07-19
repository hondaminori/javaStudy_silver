package Kyokasho.chap5.Sample5_01;

public class Main {
    public static void main(String[] args) {
        // オブジェクトの生成(インスタンス化)
        Item item1 = new Item();
        Item item2;
        item2 = new Item();
        // item1のメンバにアクセス
        item1.name = "Sweater";
        String name = item1.getName();
        // item2のメンバにアクセス
        item2.setName("T-shirt");
        // 出力
        System.out.println("item1 : " + name);
        // item2のメンバにアクセス
        System.out.println("item2 : " + item2.getName());
    }
}

