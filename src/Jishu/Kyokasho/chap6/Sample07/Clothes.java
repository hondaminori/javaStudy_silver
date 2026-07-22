package Jishu.Kyokasho.chap6.Sample07;

public class Clothes extends Item {
    private String brand;
    Clothes(int id, String brand) {
        super(id);
        this.brand = brand;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Clothes brand: " + brand);
    }
}
