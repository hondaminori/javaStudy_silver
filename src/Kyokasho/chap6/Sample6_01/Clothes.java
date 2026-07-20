package Kyokasho.chap6.Sample6_01;

class Clothes extends Item {    // サブクラス
    private String brand = "Java";
    public void printClothes() {
        System.out.println("Clothes brand: " + brand);
        // System.out.println("Item id: " + id);
    }
}
