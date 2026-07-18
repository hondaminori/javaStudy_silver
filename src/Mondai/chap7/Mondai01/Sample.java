package Mondai.chap7.Mondai01;

public class Sample {
    public static void main(String... args) {

        // 引数を渡すための疑似コード
        args = new String[]{"5", "2"};

        if(new C().search(
            new int[]{1, 2, 3, 7, 9},
            Integer.parseInt(args[0]))) {
        } else {
            System.out.println("B");
        }
    }
}
