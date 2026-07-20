package Kyokasho.chap6.Sample6_07;

class Clothes extends Item {
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
