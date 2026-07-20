package Kyokasho.chap6.Sample6_07;

class Item {
    private int id;
    Item(int id) {
        this.id = id;
    }
    public void display() {
        System.out.println("Item id: " + id);
    }
}
