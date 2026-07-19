package Kyokasho.chap5.Sample5_01;

public class Item {
    String name;
    String getName() {
        return name;
    }
    void setName(String n) {
        name = n;
    }
/*
    // thisを使用したsetName()の宣言例
    void setName(String name) {
        this.name = name;
    }
*/
}
