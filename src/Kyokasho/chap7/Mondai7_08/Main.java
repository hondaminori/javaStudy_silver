package Kyokasho.chap7.Mondai7_08;

public class Main {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("a");
            x();
            System.out.print(a); // 警告回避のため
        // } catch (Exception e) {  // 選択肢 A
        } catch (RuntimeException | ClassNotFoundException e) {  // 選択肢 E

        }
    }

    public static void x() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
