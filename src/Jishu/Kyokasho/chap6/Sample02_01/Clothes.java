package Jishu.Kyokasho.chap6.Sample02_01;

public class Clothes extends Item {
    private String brand = "Java";
    @Override
    public void display() {
        super.display();
        // display();
        System.out.println("Clothes brand: " + brand);
    }
}
