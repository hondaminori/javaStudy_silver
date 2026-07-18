package Mondai.chap6.Mondai6_15;

public class B {
    private int num;
    public B(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        B b = (B) obj;
        return this.num == b.num;
    }
}
