package Kyokasho.chap6.Sample6_13;

public interface Test {
    int EXCELLENT = 100;
    public int VERY_GOOD = 90;
    static int GOOD = 80;
    final int AVERAGE = 70;
//  private int BELOW_AVERAGE = 60;     // privateは指定できない
//  public static final int VERY_POOR;  // 定数の初期化は必須

    void foo();
    public int bar();
    abstract boolean baz();
//  protected double qux();             // protectedは指定できない
//  final String quux();                // finalは指定できない
}

