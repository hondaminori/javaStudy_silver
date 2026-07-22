package Kyokasho.chap5.Mondai5_12;

class Test {
    static int x; static int y;
    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void print() {
        System.out.print(x + ":" + y);
    }
    public static void main(String[] args) {
        // Test t = new Test(6, 9);
        new Test(6, 9);
        System.out.print(x + ":" + y);  // 選択肢D
    }
}
