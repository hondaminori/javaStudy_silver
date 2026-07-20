package Kyokasho.chap6.Sample6_12;

abstract class Transport {                // 抽象クラス
    private int speed;
    public Transport(int speed) { this.speed = speed; }
    public int getSpeed() { return speed; }
    public abstract void move();          // 抽象メソッド
}
