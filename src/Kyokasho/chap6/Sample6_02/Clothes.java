package Kyokasho.chap6.Sample6_02;

class Clothes extends Item {
    private String brand = "Java";
    @Override
    public void display() {
        super.display();
        // display();
        System.out.println("Clothes brand: " + brand);
    }
}
